package h_util;

import java.util.Arrays;

public class UtilClass implements Cloneable{

    int value;
    int key;
    int arr[] = new int[2];

    @Override
    public boolean equals(Object obj) {
        return false;
    }
    @Override
    public int hashCode() {
        return value + key;
    }
    @Override
    public String toString() {
        return "key : " + key + " value : " + value + "arr : " + Arrays.toString(arr);
    }
    @Override
    public UtilClass clone() throws CloneNotSupportedException {
        UtilClass clone = (UtilClass) super.clone();
        // 깊은 복사
        clone.arr = this.arr.clone();

        return clone;
    }

    public UtilClass(int key, int value, int[] arr) {
        this.key = key;
        this.value = value;
        this.arr = arr;
    }
}
