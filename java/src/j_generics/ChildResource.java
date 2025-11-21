package j_generics;

public class ChildResource extends CustomResource {

    public int getResource() {
        return super.value + 50;
    }

    public ChildResource(int value) {
        super(value);
    }

}
