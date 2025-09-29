import f_oop.OOP_2;
import f_oop.OOP_3;
import f_oop.OOP_4;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        OOP_4 o4 = new OOP_4();
        System.out.println(o4);

        OOP_4 o42 = new OOP_4(1,2,3);
        System.out.println(o4);

        long end = System.currentTimeMillis();
        System.out.println("처리 시간 : " + (end - start) + "ms");
    }
}