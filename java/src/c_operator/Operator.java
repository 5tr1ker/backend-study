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

    public void OperatorEx4() {
        int a = 5;
        int b = 0;

        if(a != 0 || ++b != 0) {
            System.out.println("값은 참입니다.");
        }

        if(a == 5 || OperatorEx5()) {
            System.out.println("두 번째 역시 참 입니다.");
        }

        System.out.printf("a = %d , b = %d \n", a, b);
    }

    public boolean OperatorEx5() {
        System.out.println("메서드가 실행됩니다!!");

        return true;
    }

    public void OperatorEx6() {
        int a = 0xABCD;
        System.out.printf("%X \n" , a);

        a = a >> 4;
        System.out.printf("%X \n" , a);

        a = a >> 4;
        System.out.printf("%X \n" , a);

        a = a >> 4;
        System.out.printf("%X \n" , a);

        a = 32;
        System.out.println(a);

        a = a >> 1;
        System.out.println(a);

        a = a >> 32;
        System.out.println(a);

        a = a >> 33;
        System.out.println(a);
    }

    public void OperatorEx7() {
        final int a;

        a = 44;
        // a = 55;
    }
}
