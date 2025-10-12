import f_oop.*;
import f_oop.interfacestudy.CarManager;
import f_oop.interfacestudy.K5;
import f_oop.interfacestudy.Sonata;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // 코드 작성 시작

        // BMW bmw = new BMW(); private 생성자
        Parent parent = new Parent();
        parent.print();
        System.out.println(parent.index);

        parent = new Child();
        parent.print();
        System.out.println(parent.index);

        Child child = new Child();
        child.print();
        System.out.println(child.index);

        // 추상 클래스의 다형성
        Unit unit = new Marine();
        unit.move();

        // 인터페이스의 다형성
        // InterfaceStudy -> 인터페이스
        // InterfaceImplements -> 구현체
        InterfaceStudy is1 = new InterfaceImplements();

        // 인터페이스의 공통 묶기
        CarManager cm = new CarManager();
        cm.carManager(new K5());
        cm.carManager(new Sonata());


        // 코드 작성 끝

        long end = System.currentTimeMillis();
        System.out.println("처리 시간 : " + (end - start) + "ms");
    }
}