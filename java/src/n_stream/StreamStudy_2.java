package n_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy_2 {

    public static void main(String[] args) {
        int[] maps = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(maps);
        int result = intStream.reduce(0 , (a , b) -> a + b);
        System.out.println(result);
    }

}
