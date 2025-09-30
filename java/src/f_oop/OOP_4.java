package f_oop;

public class OOP_4 {

    int a;
    int b;
    int c;
    int d;
    int e = d; // 멤버 변수는 초기화 할 수 있다.

    public OOP_4(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public OOP_4() {
        this(5,3,2);
    }

    public int test(int a) {
        int b;
        // int c = b; b를 초기화 하지 않았다.

        return a;
    }

    @Override
    public String toString() {
        return "OOP_4{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

}
