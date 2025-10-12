package f_oop.interfacestudy;

public class CarManager {

    public void carManager(KIA kia) {
        if(kia instanceof Sonata) {
            System.out.println("쏘나타 클래스가 호출되었습니다.");

            Sonata sonata = (Sonata) kia;
            sonata.move();
            sonata.on();
            sonata.off();
        }
        else if(kia instanceof K5) {
            System.out.println("K5 클래스가 호출되었습니다.");
            K5 k5 = (K5) kia;
            k5.move();
            k5.on();
            k5.off();
        }
    }

}
