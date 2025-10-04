import f_oop.KIA;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Object o;

        KIA o6 = new KIA();
        System.out.println(o6.door + " : " + o6.engineSize);
        // o6.sunLoop; default 이므로 접근 불가
        o6.print();


        long end = System.currentTimeMillis();
        System.out.println("처리 시간 : " + (end - start) + "ms");
    }
}