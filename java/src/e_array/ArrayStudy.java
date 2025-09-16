package e_array;

import java.lang.instrument.Instrumentation;
import java.lang.reflect.Array;
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
    
    public void arrayEx08() {
        char ch = '\u0000';

        System.out.println(ch);
    }

    public void arrayEx09() {
        String[] name = new String[10];
        name[0] = "Park";
        name[1] = "Sang";
        name[2] = "Jin";

        String[] age = new String[] {"a" , "b" , "C"};
        String[] c = {"1" , "2" , "#"};



        System.out.println(Arrays.toString(name));
    }

    public void arrayEx10() {
        String str = "this is java";
        char[] arr = str.toCharArray();
        String newStr = new String(arr);

        System.out.println(arr);
        System.out.println(newStr);
    }

    public void arrayEx11(String[] args) {
        for(String input : args) {
            System.out.println("입력 : " + input);
        }
    }

    public void arrayEx12() {
        int[][] arr = new int[4][3];
        int[][] arr_1 = new int[][] {{1} , {2} , {3}};
        int[][] arr_2 = {{1,2,3} , {4,5,6} , {7,8,9}};

        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_1[i].length; j++) {
                System.out.printf("%d" , arr_1[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arr_2.length; i++) {
            for (int j = 0; j < arr_2[i].length; j++) {
                System.out.printf("%d" , arr_2[i][j]);
            }
            System.out.println();
        }
    }

    public void arrayEx13() {
        int arr[][] = new int[5][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[7];
        arr[3] = new int[6];
        arr[4] = new int[9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d" , arr[i][j]);
            }
            System.out.println();
        }
    }

    public void arrayEx14() {
        int arr[][] = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
                {0},
                {}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d" , arr[i][j]);
            }
            System.out.println();
        }

        for(int []input : arr) {
            for(int value : input) {
                System.out.print(value);
            }
        }
    }

}
