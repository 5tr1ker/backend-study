package f_oop;

public class InterfaceImplements extends Parent implements InterfaceStudy {

    @Override
    public void printer() {

    }

    @Override
    public void walk() {

    }

    InterfaceStudy method(InterfaceStudy study) {
        return new InterfaceImplements();
    }

}
