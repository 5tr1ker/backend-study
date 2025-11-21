package j_generics;

public class GenericClazz <T extends CustomResource & AutoCloseable> extends SuperGenericClazz<T>{

    public T resource;

    public T getResource() {
        return resource;
    }

    public void setResource(T resource) {
        this.resource = resource;
    }

}
