package j_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static j_generics.GenericMethodStudy.callMethod;

public class GenericsStudy {

    public static void main(String[] args) {
        //SuperGenericClazz<CustomResource> superGenericClazz = new GenericClazz<>();

        /*
        GenericClazz<String> genericClazz = new GenericClazz<String>();
        genericClazz.setResource("test");
        System.out.println(genericClazz.getResource());

        GenericClazz<CustomResource> a1 = new GenericClazz<>();
        a1.setResource(new  CustomResource(30));
        System.out.println(a1.getResource().value);

        GenericClazz<CustomResource> a2 = new GenericClazz<>();
        a2.setResource(new ChildResource(30));
        System.out.println(a2.getResource().value);

         */

//        GenericMethodStudy.<String>callMethod("input Test-000");
//        callMethod("input Test-001");
//        //<String>callMethod("abc");
//        GenericMethodStudy.callMethod("input Test-002");

        ArrayList list = new ArrayList();
        ArrayList<String> result = (ArrayList<String>) list;

        ArrayList<String> list_2 = new ArrayList<>();
        ArrayList<?> list_3 = new ArrayList<String>();
        ArrayList<String> list_4 = (ArrayList<String>) list_3;

        ArrayList<? extends Object> list_5 = (ArrayList<? extends Object>) list_3;

    }

    public static void printInfo(GenericClazz<? extends CustomResource> resource) {
        CustomResource result = resource.getResource();

    }

}
