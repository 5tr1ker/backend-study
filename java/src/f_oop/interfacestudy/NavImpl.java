package f_oop.interfacestudy;

public class NavImpl implements Nav {
    @Override
    public void on() {
        System.out.println("네이게이션이 호출되었습니다.");
    }

    @Override
    public void off() {
        System.out.println("네비게이션이 꺼집니다.");
    }
}
