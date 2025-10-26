package g_exception;

import java.awt.*;

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

    // init cause 테스트
    public int method06() {
        try {
            throw new FontFormatException("error 1");
        } catch (FontFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public int method07() {
        try {
            throw new Exception("예외가 발생했습니다.");
        } catch (Exception e) {
            try {
                Exception ep = new Exception("서브서브");
                ep.initCause(e);
                throw ep;
            } catch (Exception e2) {
                RuntimeException re = new RuntimeException("굳이 catch 하지 않아도 된다.");
                re.initCause(e2);
                throw re;
            }
        }
    }
}
