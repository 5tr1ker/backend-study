package f_oop;

public class OOP {

    class Car {
        String carNeme;
        int horsePower;
        int cc;
    }

    public void oopEx01() {
        Car []car = new Car[3]; // 참조 변수를 다루는 크기가 3인 배열

        for(int i = 0; i < 3; i++) {
            car[i] = new Car(); // 각각의 참조 변수에 객체를 생성 및 주소를 대입

            car[i].horsePower = ( i + 1 ) * 1000;
            car[i].cc = ( i + 1 ) * 67;
        }

        for(int i = 0; i < 3; i++) {
            System.out.printf("horsePower : %d , cc : %d \n" , car[i].horsePower , car[i].cc);
        }
    }

}
