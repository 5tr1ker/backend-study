package n_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);

        Stream<int[]> stream2 = Stream.of(new int[] {1,2,3,4,5});
        IntStream stream3 = Arrays.stream(new int[] {5,6,7,8});
        IntStream intStream = IntStream.of(new int[] {1,2,3,4,5});


        Random random = new Random();
        IntStream randomStream = random.ints(0 , 50).limit(5);
        randomStream.forEach(System.out::println);
    }

}
