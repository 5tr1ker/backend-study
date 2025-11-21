package j_generics;

public class CustomResource implements AutoCloseable {

    int value;

    public CustomResource(int value) {
        this.value = value;
    }

    @Override
    public void close() throws Exception {

    }
}
