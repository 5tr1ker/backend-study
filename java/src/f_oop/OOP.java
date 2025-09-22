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

    class Card {
        String kind;
        int number;
        static int width;
        static int height;
    }

    public void oopEx02() {
        Card c1 = new Card();
        Card c2 = new Card();

        Card.width = 200;
        Card.height = 300;

        c1.kind = "Heart";
        c1.number = 5;
        c2.kind = "Club";
        c2.number = 3;
        System.out.println("c1의 경우 width : " + c1.width + " height : " + c1.height + " kind : " + c1.kind + " number : " + c1.number);
        System.out.println("c2의 경우 width : " + c2.width + " height : " + c2.height + " kind : " + c2.kind + " number : " + c2.number);

        c1.width = 65535;
        c2.height = 12345;

        System.out.println("c1의 경우 width : " + c1.width + " height : " + c2.height + " kind : " + c1.kind + " number : " + c1.number);
        System.out.println("c2의 경우 width : " + c2.width + " height : " + c2.height + " kind : " + c2.kind + " number : " + c2.number);
    }

}
