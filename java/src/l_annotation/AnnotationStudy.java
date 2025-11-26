package l_annotation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AnnotationStudy {

    @SuppressWarnings({"deprecation" , "rawtypes" , "unchecked"})
    public static void main(String[] args) {
        Date date = new Date(2000 , Calendar.APRIL, 2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(date);

        test();
    }

    public static void test() {
        safeTest("1" , "2" , "3");
        safeTest(1,2,3,4);
    }

    //@SafeVarargs
    @SuppressWarnings("unchecked")
    public static <T>void safeTest(T... a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
