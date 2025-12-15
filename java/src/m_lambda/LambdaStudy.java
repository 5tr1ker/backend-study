package m_lambda;

import java.io.FilenameFilter;
import java.util.function.*;

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


        Consumer<Integer> consumer = a -> System.out.println(a);
        consumer.accept(50);

        Supplier<String> supplier = () -> "index";
        System.out.println(supplier.get());

        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(5));

        DoubleToIntFunction doubleToIntFunction = a -> (int) (a * 100);
        System.out.println(doubleToIntFunction.applyAsInt(5.32));

        IntUnaryOperator integerIntUnaryOperator = a -> a * a;
        System.out.println(integerIntUnaryOperator.applyAsInt(5));

        Function<String, Integer> fcTest = Integer::parseInt;
        System.out.println(fcTest.apply("50"));
    }

}
