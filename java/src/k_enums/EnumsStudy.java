package k_enums;

import java.util.Arrays;
import java.util.HashMap;

public class EnumsStudy {

    public static void main(String[] args) {
        System.out.println(Hyundai.AVANTE);

        if(Hyundai.SONATA != Hyundai.AVANTE) {
            System.out.println("두 차종은 다른 차종..");
        }

        System.out.println(Hyundai.GRANDEUR.compareTo(Hyundai.SONATA));

        switch (Hyundai.GRANDEUR) {
            case AVANTE:
                System.out.println("아반뗴");
                break;
            case SONATA:
                System.out.println("쏘나타");
                break;
            case GRANDEUR:
                System.out.println("그랜저");
                break;
            default:
                System.out.println("??");
        }

        Hyundai[] hyundais = Hyundai.values();
        System.out.println(Arrays.toString(hyundais));

        System.out.println(Hyundai.valueOf("AVANTE"));
        System.out.println(Enum.valueOf(Hyundai.class, "GRANDEUR"));
        System.out.println(Hyundai.AVANTE.name());

        System.out.println(Hyundai.AVANTE.calculate0_100());
    }

}
