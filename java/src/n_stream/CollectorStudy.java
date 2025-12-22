package n_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CollectorStudy implements Collector<String, StringBuffer, String> {

    @Override
    public Supplier<StringBuffer> supplier() {
        return () -> new StringBuffer();
    }

    @Override
    public BiConsumer<StringBuffer, String> accumulator() {
        return (sb2 , s) -> sb2.append(s);
    }

    @Override
    public BinaryOperator<StringBuffer> combiner() {
        return (sb1 , sb2) -> sb1.append(sb2);
    }

    @Override
    public Function<StringBuffer, String> finisher() {
        return sb2 -> sb2.toString();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }

    public static void main(String[] args) {
        String[] str = {"a" , "b" , "c"};
        Stream<String> streamStr = Arrays.stream(str);

        String result = streamStr.collect(new CollectorStudy());
        System.out.println(result);
    }

}
