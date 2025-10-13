package f_oop.interfacestudy;

public class K5 extends CarTemplate implements Moveable , KIA , Nav {

    private NavImpl nav = new NavImpl();

    public K5() {
        setting(2000, "k5");
    }

    @Override
    public void move() {
        System.out.println(this + "움직입니다.");
    }

    @Override
    public void stop() {
        System.out.println(this + "멈춥니다.");
    }

    @Override
    public void help() {
        Moveable.super.help();
    }

    @Override
    public void on() {
        nav.on();
    }

    @Override
    public void off() {
        nav.off();
    }
}
