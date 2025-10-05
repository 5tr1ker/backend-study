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
        System.out.println("CAR 기본 constructor");
    }

    public Car(int sunLoop) {
        System.out.println("constructor {sunloop}");
        this.sunLoop = sunLoop;
    }

    public void print() {
        System.out.println("print_oop_5");
    }
}
