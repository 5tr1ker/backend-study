package l_annotation;

@CustumAnnotation(
        writer = "sjpark",
        type = AnnotationType.WARNING,
        date = @Datetime(yymmdd = "251130" , hhmmss = "093100"),
        arraytest = "{\"1\" , \"2\" , \"3\"}",
        simpleTest = @SimpleTest("123")
)
public class AnnotationStudy {

    @SuppressWarnings({"deprecation" , "rawtypes" , "unchecked"})
    public static void main(String[] args) {
//        Date date = new Date(2000 , Calendar.APRIL, 2);
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(date);
//
//        test();
        Class<AnnotationStudy> annotationStudyClazz = AnnotationStudy.class;
        CustumAnnotation custumAnnotation = annotationStudyClazz.getAnnotation(CustumAnnotation.class);

        System.out.println(custumAnnotation.writer());
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
