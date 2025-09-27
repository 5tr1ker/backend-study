package f_oop;

public class OOP {

    public static String writer = "sjpark";

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

    public void oopEx03() {
        int result = add(5,6);

        System.out.println(result);
    }

    private int add(int a, int b) {
        return a + b;
    }

    public void oopEx04() {
        double result = addLong(30,-5);

        System.out.println(result);
    }

    private long addLong(long a, long b) {
        return a + b;
    }

    public static void testMethod() {
        // oopEx03(); 호출 불가능
    }

    public int oopEx05() {

        // return; // 컴파일러에 의해 제공
        return add(3 , 5);
    }

    public int oopEx06(int input) {
        if(input > 0) {
            return 5;
        } else {
            return 10;
        }
    }

    public void oopEx07() {
        Car car = new Car();

        car.horsePower = 520;
        car.carNeme = "BMW M4";
        car.cc = 3000;

        System.out.println(car.carNeme + " : " + car.cc + " : " + car.horsePower);

        oopEx08(car);

        System.out.println(car.carNeme + " : " + car.cc + " : " + car.horsePower);
    }

    private void oopEx08(Car car) {
        car.horsePower = 80;
        car.carNeme = "KIA RAY";
        car.cc = 1000;
    }

    public void oopEx09() {
        Car car = new Car();

        car.horsePower = 520;
        car.carNeme = "BMW M4";
        car.cc = 3000;
        System.out.println(car.carNeme + " : " + car.cc + " : " + car.horsePower);

        oopEx10(car.cc , car.horsePower);

        System.out.println(car.carNeme + " : " + car.cc + " : " + car.horsePower);
    }

    private void oopEx10(int cc, int horsePower) {
        cc = 123;

        horsePower = 567;
    }

    public void oopEx11() {
        Car car = oopEx12();

        System.out.println(car.carNeme + " : " + car.cc + " : " + car.horsePower);
    }

    private Car oopEx12() {
        Car car = new Car();

        car.horsePower = 125;
        car.carNeme = "aefase";
        car.cc = 123;

        return car;
    }

    public int recursive(int n){
        if(n < 0) return n;
        return n + recursive(n - 1);
    }

    public int banbokmoon(int n) {
        int result = 0;

        for(int i = 0; i < n; i++) {
            result += i;
        }

        return result;
    }

    public static void oopEx14() {
        System.out.println("callcall");
    }
}
