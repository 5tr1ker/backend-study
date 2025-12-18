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

        // generate()
        Stream.generate(() -> 1).limit(5).forEach(System.out::println);
        Stream.iterate(5, a -> a + 2).limit(5).forEach(System.out::println);

        Stream<Integer> stream_1 = Stream.iterate(0, a -> a + 1).limit(5);
        Stream<Integer> stream_2 = Stream.generate(() -> 2).limit(5);
        Stream<Integer> stream_3 = Stream.concat(stream_1, stream_2);
        // 0
        //1
        //2
        //3
        //4
        //2
        //2
        //2
        //2
        //2

        stream_3 = stream_3.distinct().filter(a -> a % 2 == 0);
        stream_3.forEach(System.out::println);

        Stream<String[]> flatMapStream = Stream.of(
                new String[] {"hello" , "nice" , "to" , "meet" , "you"},
                new String[] {"my" , "name" , "is" , "chicky~"}
        );
        Stream<String> newFlatMapStream = flatMapStream.flatMap(Arrays::stream);

    }

}
