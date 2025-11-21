package j_generics;

public class GenericsStudy {

    public static void main(String[] args) {
        SuperGenericClazz<CustomResource> superGenericClazz = new GenericClazz<>();

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
    }

}
