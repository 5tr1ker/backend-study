package f_oop;

public class BMW extends Car {

    private static BMW bmw = new BMW();

    private BMW() {

    }

    public static BMW getInstance() {
        return bmw;
    }

}
