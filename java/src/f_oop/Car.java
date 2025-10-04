package f_oop;

public class Car {

    int sunLoop = 5115;
    public int door = 4; // 명시적 초기화
    static {
        System.out.println("static {}");
    }

    {
        System.out.println("instance {}");
    }

    public Car() {
        System.out.println("constructor");
    }

    public void print() {
        System.out.println("print_oop_5");
    }
}
