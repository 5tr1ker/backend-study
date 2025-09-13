package e_array;

import java.util.Arrays;

public class ArrayStudy {

    public void arrayEx01() {
        int arr[] = new int[Integer.MAX_VALUE];
        int arr2[] = new int[Integer.MAX_VALUE];
        int arr3[] = new int[Integer.MAX_VALUE];
        int arr4[] = new int[Integer.MAX_VALUE];

        System.out.println(arr.length);
    }

    public void arrayEx02() {
        int arr[] = new int[0];

        System.out.println(arr.length);
    }

    public void arrayEx03() {
        //int arr[] = new int[5] {845,56,98,46,5}; // 오류
        //int arr[] = new int[] {412,616,724741,614}; // 가능
        //int arr[] = {312,51,216,126,214}; // 가능
        int arr[];
        arr = new int[] {12,3,124,12,4}; // 가능
        //arr = {1,23,4,5}; // 오류

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void arrayEx04() {
        int arr[] = {123,214,12,512,5};

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        for(int output : arr)
            System.out.println(output);

        System.out.println("주소 : " + arr);
    }

    public void arrayEx05() {
        char ch[] = {'A' , 'B' , 'C' , 'D'};
        System.out.println(ch);
    }

    public void arrayEx06() {
        int arr[] = {1,2,3,4,5};
        int temp[] = new int[arr.length * 2];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        arr=temp;
        System.out.println(Arrays.toString(arr));
    }

    public void arrayEx07() {
        int arr[] = {1,2,3,4,5};
        int temp[] = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 2 , arr.length);
        System.out.println("TEMP : " + Arrays.toString(temp));
        System.out.println("ARR : " + Arrays.toString(arr));
    }

}
