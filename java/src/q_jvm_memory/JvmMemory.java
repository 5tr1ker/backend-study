package q_jvm_memory;

public class JvmMemory {

    public int a = 0; // 인스턴스 변수
    public static int b = 0; // 클래스 변수
    public static int c;

    public static void main(String[] args) { // 매개변수
        int c = 0; // 지역 변수

    }

    class Car { // 메서드 영역
        public static String globalKey; // 메서드 영역
        private final String uuid; // 객체 생성 시 힙 영역
        public String name; // 객체 생성 시 힙 영역
        public int cc; // 객체 생성 시 힙 영역
        public final int index = 1; // 객체 생성 시 힙 영역

        public Car(String uuid, String name, int cc) {
            this.uuid = uuid;
            this.name = name;
            this.cc = cc;
        }

        public String toString() { // 메서드 영역
            return uuid + " name : " + name + " cc : " + cc;
        }

        public static void printInfo() { // 메서드 영역
            System.out.println("global Information");
        }

    }

}
