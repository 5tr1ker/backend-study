package f_oop;

public class KIA extends Car {

    public int engineSize = 50;
    public int sunLoop = 0;

    public KIA(int sunLoop) {
        // super(sunLoop);
        System.out.println("KIA constructor sunLoop = " + sunLoop);
        this.sunLoop = sunLoop;
    }

    public KIA() {
        System.out.println("KIa default constructor");
    }

    public void print() {
        System.out.println("print_oop_6");
        System.out.println(super.sunLoop);
    }
}
