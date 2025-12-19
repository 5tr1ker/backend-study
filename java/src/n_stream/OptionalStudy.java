package n_stream;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalStudy {

    public static void main(String[] args) {
        String resource = "data";
        Optional<String> optional = Optional.of(resource);
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(optional.get());
        System.out.println(optional2.orElse("empty String"));

        System.out.println(optional2.orElseGet(() -> "default String"));
//        System.out.println(optional2.orElseThrow(NullPointerException::new));

        String result = optional.map(String::toUpperCase).orElse("default String");
        System.out.println(result);

        if(!emptyOptional.isPresent()) {
            System.out.println("is empty");
        }

        optional.ifPresent(System.out::println);

        OptionalInt optionalInt = OptionalInt.of(0);
        System.out.println(optionalInt.getAsInt());


    }

}
