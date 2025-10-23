package g_exception;

import java.io.IOException;

public class TryCatchTest {

    public void method1() {
        try {
            try {

            } catch (Exception e) {

            }
        } catch (Exception e) {
            try {

            } catch (Exception ex) { // 이름 중복

            }
        }

        try {

        } catch (Exception e) {

        }
    }

    public void method2() {
        int number = 100;
        for(int i = 0; i < 10; i++) {
            try{
                int index = (int) (Math.random() * 10);

                System.out.println(number / index);
            } catch(ArithmeticException e){
                System.out.println(0);
            }

            int index = (int) (Math.random() * 10);

            System.out.println(number / index);
        }
    }

    public void method3() {
        try {
            System.out.println(0);
            System.out.println(1);
            System.out.println(0/0);
            System.out.println(2);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(3);
        } catch (Exception e){
            System.out.println(4);
        }
        System.out.println(5);
    }

    public void method4() {
        try {
            System.out.println(0);
            System.out.println(1);
            System.out.println(0/0);
            System.out.println(2);
        } catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println("ArithmeticException !_!");
            }
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(6);
    }

    public void method5() {
        try {
            System.out.println("hello");

            method6();
        } catch (ArithmeticException | IOException e){
            System.out.println(e.getClass().getName());

            System.out.println(e.getMessage());
        }
    }

    private void method6() throws ArithmeticException, IOException {
        ArithmeticException e = new ArithmeticException("arithmeticException 발생하였습니다.");

        throw e;
    }

    private void method07() {
        throw new RuntimeException();
    }

//    private void method08() {
//        throw new Exception();
//    }

    public void method08() throws Exception {
        method09();
    }

    public void method09() throws Exception {
        method10();
    }

    public void method10() throws Exception {
        throw new Exception();
    }

    public void method11() {
        try {
            method09();
        } catch (Exception e) {
            System.out.println("예외를 잡았습니다.");
            e.printStackTrace();
        }
    }

    public void method12(boolean flag) {
        try {
            System.out.println("1번쨰");
            if(flag) throw new Exception();
            return;
        } catch (Exception e) {
            System.out.println("3번째");
            return;
        } finally {
            System.out.println("2번째");

        }
    }

}
