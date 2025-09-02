package c_operator;

public class Operator {

    public void OperatorEx1() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        System.out.println(c);
    }

    public void OperatorEx2() {
        char a = 'a';
        char b = 'a' + 1;
        //char c =  (a + b); 오류
        char c =  (char) (a + b);
        System.out.println(c);
    }

    public void OperatorEx3() {
        System.out.println(3142.0 / 1000);

        System.out.println(3142.0 / 1000.0);
    }

}
