package f_oop;

public class OOP_5 {

    int door = 4; // 명시적 초기화
    static {
        System.out.println("static {}");
    }

    {
        System.out.println("instance {}");
    }

    public OOP_5() {
        System.out.println("constructor");
    }

}
