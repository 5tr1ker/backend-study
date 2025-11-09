package i_collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorStudy {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


    }

}
