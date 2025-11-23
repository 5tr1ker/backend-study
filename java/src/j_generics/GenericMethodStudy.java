package j_generics;

public class GenericMethodStudy<T> {

    public static <T extends String>void callMethod(T index) {
        System.out.println("Calling method " + index);
    }

}
