package i_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysStudy {

    public static void main(String[] args) {
        int arr[] = {1,2,5,71,51};

        System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 2)));

        int arr2[] = new int[10];
        Arrays.fill(arr2, -1);
        System.out.println(Arrays.toString(arr2));
        //Arrays.setAll(arr2, () -> (int) (Math.random() * 5) + 1);
        System.out.println(Arrays.toString(arr2));


        int arr3[][] = { {1,2,3} , {4,5,6} , {7,8,9} };
        System.out.println(Arrays.deepToString(arr3));

        int arr4[][] = { {1,2,3} , {4,5,6} , {7,8,9} };
        System.out.println(Arrays.deepEquals(arr3, arr4));

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list_2 = Arrays.asList(new  Integer[]{1,2,3,4,5});

        ArrayList<Integer> arrayList = new ArrayList<>(list);
        arrayList.add(50);
        System.out.println(arrayList);
    }
}
