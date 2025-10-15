package f_oop.anonymous;

public class Anonymous {

    class TargetClazz {
        int index = 100;

        public void print() {
            System.out.println("targetClass");
        }
    }

    void method(TargetClazz target) {
        System.out.println("target : " + target.index);
        target.print();
    }

    public void run() {
        method(new TargetClazz() {
            public void print() {
                System.out.println("this is anonymous Class");
            }
        });
    }

}
