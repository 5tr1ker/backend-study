package f_oop.interfacestudy;

public class Sonata extends CarTemplate implements Moveable , KIA , Nav {

    private NavImpl nav = new NavImpl();

    public Sonata() {
        setting(2000, "Sonata");
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
        KIA.super.help();
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
