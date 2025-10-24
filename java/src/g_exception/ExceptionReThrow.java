package g_exception;

public class ExceptionReThrow {

    public void method01() {
        try {
            method02();
        } catch (Exception e) {
            System.out.println("메서드 3");
        }
    }


    public void method02() throws Exception {
        try {
            System.out.println("메서드1");
            throw new Exception("예오 ");
        } catch (Exception e) {
            System.out.println("메서드2");
            throw new Exception("");
        }
    }

    public int method03() throws Exception {
        try {
            System.out.println("메서드1");
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }

    public int method04() throws Exception {
        try {
            System.out.println("메서드2");

            throw new Exception();
        } catch (Exception e) {
            System.out.println("메서드3");
            throw new Exception("");
        }
    }

    public int method05() throws Exception {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
