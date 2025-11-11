package i_collection;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorStudy {

    public static void main(String[] args) {
        Integer[] arr = {3,6,87,9,2,7,1,6,453,5,26,31};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Descending());
        System.out.println(Arrays.toString(arr));
    }

}
class Descending implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}