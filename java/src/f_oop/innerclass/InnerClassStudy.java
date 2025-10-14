package f_oop.innerclass;

public class InnerClassStudy {

    private int innerIv = 500;
    static int innerSv = 125;
    int test01 = 500;

    public class InnerClass {
        int test01 = 100;
        static int staticIv = 560;

        public void method2() {
            int test01 = 25;
            int finalIv = 25;

            System.out.println("LocalClass : " + test01);
            System.out.println("innerClass : " + this.test01);
            System.out.println("outerClass : " + InnerClassStudy.this.test01);

            class LocalClass {
                int test01 = 50;
                
                void method3() {
                    // finalIv = 10; 상수이므로 변경 불가
                }
            }
        }

        public static void staticMethod() {
            staticIv = 10;
        }
    }

    static public class staticInnerClass {
        static int staticIv = 560;

        void method4() {
            int a = innerSv;
            // int b = innerIv; 지역 변수이다.
            InnerClassStudy ics = new InnerClassStudy();
            InnerClassStudy.InnerClass ic = ics.new InnerClass();
            // 클래스 멤버가 인스턴스 멤버에 접근하기 위한 방법
        }
    }

    void method1() {
        int test01 = 25;
    }



}
