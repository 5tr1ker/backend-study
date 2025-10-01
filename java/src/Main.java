import f_oop.OOP_4;
import f_oop.OOP_5;
import f_oop.OOP_6;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        OOP_6 o6 = new OOP_6();
        System.out.println(o6.door + " : " + o6.engineSize);
        // o6.sunLoop; default 이므로 접근 불가

        long end = System.currentTimeMillis();
        System.out.println("처리 시간 : " + (end - start) + "ms");
    }
}