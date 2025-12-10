package m_lambda;

import java.io.FilenameFilter;

public class LambdaStudy {

    @FunctionalInterface
    interface Math {
        int Calc(int first);
    }

    public static Math returnLambda(int index) {
        return (input) -> index - input;
    }

    public static void printLambda(Math m) {
        System.out.println("결과 값 : " + m.Calc(50));
    }

    public static void main(String[] args) {
        Math result = a -> a * a;
        System.out.println(result.Calc(5));

        printLambda((a) -> a * a + 2);

        Math myLambda = returnLambda(50);
        System.out.println(myLambda.Calc(5));
    }

}
