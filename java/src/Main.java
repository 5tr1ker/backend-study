import f_oop.OOP_2;
import f_oop.OOP_3;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        OOP_3 o = new OOP_3(4,10,8);
        System.out.println(o);

        OOP_3 o2 = new OOP_3();
        System.out.println(o2);

        long end = System.currentTimeMillis();
        System.out.println("처리 시간 : " + (end - start) + "ms");
    }
}