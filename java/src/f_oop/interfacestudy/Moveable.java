package f_oop.interfacestudy;

public interface Moveable {

    void move();
    void stop();
    default void help() {
        System.out.println("Moveable 의 도움말");
    }

    default void booster() {
        System.out.println("Moveable의 부스터");
    }

}
