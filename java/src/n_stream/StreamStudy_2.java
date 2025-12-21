package n_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy_2 {

    public static void main(String[] args) {
        int[] maps = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(maps);
        int result = intStream.reduce(0 , (a , b) -> a + b);
        System.out.println(result);

        Stream<Integer> streamer = Stream.of(new int[]{1,2,3,4,5} , new int[] {10,41,62,21,51})
                .flatMap(arr -> Arrays.stream(arr).boxed());

        //List<Integer> streamToList = streamer.collect(Collectors.toList());
        //ArrayList<Integer> streamToArrayList = streamer.collect(Collectors.toCollection(ArrayList::new));
        //Map<String, Integer> map = streamer.collect(Collectors.toMap(p -> p + "" , p -> p));
        //System.out.println(map);

        //Object[] resource = streamer.toArray();
        //Integer[] resource_2 = streamer.toArray(Integer[]::new);

        //int sum_test = streamer.collect(Collectors.summingInt(Integer::intValue));
        //int sum_test = streamer.collect(Collectors.reducing((a, b) -> a + b)).get();
        //System.out.println(sum_test);

        //String result_2 = streamer.map(String::valueOf).collect(Collectors.joining("," ,"[" , "]"));
        //System.out.println(result_2);
//        Map<Boolean, Integer> result_grouping= streamer.collect(Collectors.partitioningBy(x -> x % 2 == 0,
//                Collectors.collectingAndThen(Collectors.maxBy(Integer::compareTo), Optional::get)
//        ));
        //Map<Boolean, Map<Boolean, List<Integer>>> result_grouping= streamer.collect(Collectors.partitioningBy(x -> x % 2 == 0,
        //        Collectors.partitioningBy(x -> x > 30)
        //));

//        Map<Integer, List<Integer>> result_grouping = streamer.collect(
//                Collectors.groupingBy((a) -> a % 3 , Collectors.toList())
//        );

//        Map<String, List<Integer>> result_grouping = streamer.collect(
//                Collectors.groupingBy(s -> {
//                    if(s % 3 == 0) return "3의 배수";
//                    if(s % 3 == 1) return "1의 배수";
//                    if(s % 3 == 2) return "2의 배수";
//                    return "";
//                } , Collectors.toList())
//        );

        Map<Integer, Map<Integer, List<Integer>>> result_grouping = streamer.collect(
                Collectors.groupingBy((a) -> a % 3 ,
                        Collectors.groupingBy((a) -> a % 2 , Collectors.toList()))
        );
        System.out.println(result_grouping);

    }

}
