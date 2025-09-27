package f_oop;

public class OOP_2 {

    private static String writer = "sjpark";
    private String temp = "what?";

    public void oopEx01() {
        System.out.println("지역 변수 호출");
    }

    public static int oopEx02() {
        OOP_2 oop2 = new OOP_2(); // 인스턴스 변수를 호출하기 위한 인스턴스 생성
        oop2.oopEx01();

        System.out.println(writer); // 전역변수
        System.out.println(oop2.temp); // 지역변수

        return 0;
    }

    public int oopEx03(int a, int b) {
        return a + b;
    }

    public int oopEx03(long a, long b) {
        return (int) a + (int) b;
    }

    public void oopEx04(String... args) {
        for(String str : args) {
            System.out.printf(str + " ,");
        }

        System.out.println();
    }

    public void oopEx05() {
        oopEx04("a" , "b" , "c");
        oopEx04("c");
        oopEx04();
        oopEx04(new String[] {"A" , "B" , "C"});
    }

}
