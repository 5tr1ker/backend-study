package m_lambda;

import java.io.FilenameFilter;

public class LambdaStudy {

    @FunctionalInterface
    interface Math {
        int Calc(int first);
    }

//    public static int max(int a, int b) {
//        return Math.max(a, b);
//    }

    public static void main(String[] args) {
        Math result = a -> a * a;
        System.out.println(result.Calc(5));
    }

}
