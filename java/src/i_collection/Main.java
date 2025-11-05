package i_collection;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        /*
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

         */

        ArrayList<Integer> ar = new ArrayList<>();

        Vector<Integer> vector = new Vector<>(5);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);
        System.out.println(vector.capacity());

        vector.setSize(2);
        System.out.println(vector);
        System.out.println(vector.capacity());

        vector.setSize(7);
        System.out.println(vector);
        System.out.println(vector.capacity());
    }

}
