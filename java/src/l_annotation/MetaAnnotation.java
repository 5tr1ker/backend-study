package l_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

public class MetaAnnotation {

    @Target(TYPE)
    public @interface MyTypeAnnotation {}

    @Target(FIELD)
    public @interface MyFieldAnnotation {}

    @Target(TYPE_USE)
    public @interface MyTypeUseAnnotation {}

    @MyTypeAnnotation
    class MyClass {

        @MyTypeUseAnnotation
        MyClass clazz;

        @MyFieldAnnotation
        int a;
    }

    @Repeatable(Todos.class)
    public @interface Todo {
        String value();
    }

    public @interface Todos {
        Todo[] value();
    }

    @Todo("todo1")
    @Todo("todo2")
    public static void main(String[] args) {
        Object obj = new Object();
    }

}
