package l_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.LocalDateTime;

@Retention(RetentionPolicy.RUNTIME)
public @interface CustumAnnotation {

    int printer() default 0;
    String writer() default "empty";
    String[] arraytest() default {"1" , "2"};
    AnnotationType type();
    Datetime date();
    SimpleTest simpleTest();

}

@Retention(RetentionPolicy.RUNTIME)
@interface SimpleTest {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Datetime {
    String yymmdd();
    String hhmmss();
}

enum AnnotationType {
    WARNING , INFO , DEBUG
}