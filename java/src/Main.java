import f_oop.OOP_4;
import f_oop.OOP_5;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        OOP_5 o5 = new OOP_5();

        long end = System.currentTimeMillis();
        System.out.println("처리 시간 : " + (end - start) + "ms");
    }
}