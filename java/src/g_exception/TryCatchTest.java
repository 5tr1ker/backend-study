package g_exception;

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
}
