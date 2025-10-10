import f_oop.*;

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

        Unit unit = new Marine();
        unit.move();

        // 코드 작성 끝

        long end = System.currentTimeMillis();
        System.out.println("처리 시간 : " + (end - start) + "ms");
    }
}