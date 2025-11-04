package i_collection;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(2);
        ar.add(3);
        for(int i = 0; i < ar.size(); i++){
            if(ar.get(i) % 2 == 0) {
                ar.remove(i);
            }
        }
        System.out.println(ar);
    }

}
