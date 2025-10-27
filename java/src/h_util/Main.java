package h_util;

import java.nio.charset.Charset;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("abcabc".substring(0,3));

        String strValue = "151 ";
        System.out.println(Integer.parseInt(strValue.trim()));
        System.out.println(Integer.valueOf(strValue.trim()));
        System.out.println(Integer.parseInt("fffff" , 16));

        int value = 30;
        System.out.println("" + value);
        System.out.println(String.valueOf(30));

        System.out.println(String.format("%s 값은 %d 이다." , "six" , 6));

        // 2

        UtilClass uc = new UtilClass(0,0, new int[] {1,2,3});
        uc.key = 50;
        uc.value = 12;
        UtilClass uc2 = uc.clone();
        uc.arr[0] = 4141;
        System.out.println(uc.toString());
        System.out.println(uc2.toString());

        // 얕은 복사
        int arr_1[] = {1,2,3,4,5};
        int arr_2[] = arr_1.clone();
        arr_2[0] = 6;
        System.out.println(Arrays.toString(arr_1));
        System.out.println(Arrays.toString(arr_2));

        UtilClass arr_3[] = {new UtilClass(1,2, new int[] {10,20}) , new UtilClass(3,4, new int[] {30,40})};
        UtilClass arr_4[] = arr_3.clone();
        arr_3[0].key = 50;
        arr_3[0].value = 12;
        arr_3[0].arr[0] = 9999;

        System.out.println(Arrays.toString(arr_3));
        System.out.println(Arrays.toString(arr_4));

        System.out.println(uc.hashCode());
        System.out.println(Charset.availableCharsets());

    }

}
