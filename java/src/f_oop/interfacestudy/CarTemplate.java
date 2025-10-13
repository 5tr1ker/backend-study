package f_oop.interfacestudy;

public abstract class CarTemplate {

    public int engine;
    public String name;

    public void setting(int engine, String name) {
        this.engine = engine;
        this.name = name;
    };

    public String toString() {
        return "engine : " + engine + " name : " + name;
    }

    public void booster() {
        System.out.println("CarTemplate 부스터");
    }

}
