package i_collection;

import java.util.*;

public class CollectionsStudy {

    public static void main(String[] args) {
        /*
        List<String> arrayList = Collections.synchronizedList(new ArrayList<String>());
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);

        arrayList = Collections.unmodifiableList(arrayList);
        arrayList.add("d");
        arrayList.add("e");

        System.out.println(arrayList);



        List list = Collections.checkedList(new ArrayList(), String.class);
        list.add("f");
        list.add("g");
        System.out.println(list);

         */

        Set<String> a = Collections.singleton("edge");
        System.out.println(a);
    }
}
