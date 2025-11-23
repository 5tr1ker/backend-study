package k_enums;

enum Hyundai {

    AVANTE(1600) {
        @Override
        public double calculate0_100() {
            return 9.3;
        }
    }, SONATA(2000) {
        @Override
        public double calculate0_100() {
            return 8.8;
        }
    } , GRANDEUR(3500) {
        @Override
        public double calculate0_100() {
            return 7.9;
        }
    };

    private final int cc;
    public abstract double calculate0_100();
    Hyundai(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

}
