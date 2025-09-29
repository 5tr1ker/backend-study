package f_oop;

public class OOP_4 {

    int a;
    int b;
    int c;

    public OOP_4(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public OOP_4() {
        this(5,3,2);
    }

    @Override
    public String toString() {
        return "OOP_4{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

}
