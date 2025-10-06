package f_oop;

public class KIA extends Car {

    private int engineSize = 50;
    private int sunLoop = 0;

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

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getSunLoop() {
        return sunLoop;
    }

    public void setSunLoop(int sunLoop) {
        this.sunLoop = sunLoop;
    }
}
