package i_collection;

import java.util.*;

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object o2) {
        Person o1 = (Person) o2;
        if(o1.age == this.age && o1.name.equals(this.name)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + "\n";
    }
}

public class SetStudy {

    public static void main(String[] args) {
        /*
        for(int z = 0; z < 10; z++) {
            HashSet<Integer> set = new HashSet<>();
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for(int i = 0; i < 10; i++) {
                set.add((int) (Math.random() * 5) + 1);
            }

            System.out.println(set);
        }

        HashSet<Person> people = new HashSet<>();
        for(int i = 0; i < 10; i++) {
            Person person = new Person((int) (Math.random() * 5) + 1,"People");
            people.add(person);
        }

        System.out.println(people);

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i = 0; i < 10; i++) {
            treeSet.add((int) (Math.random() * 100) + 1);
        }

        System.out.println(treeSet);
        System.out.println(treeSet.subSet(0 , 20)); // 범위 검색
        System.out.println(treeSet.headSet(50)); // 50 보다 작은거
        System.out.println(treeSet.tailSet(50)); // 50 보다 큰거



        String input = "awgawgsrhtdjasdrthasdrjadrhasdg";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            String ch = input.charAt(i) + "";

            if(hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }

        for (String key : hashMap.keySet()) {
            System.out.printf("[%s] : %d%n", key, hashMap.get(key));
        }

         */

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for(int i = 0; i < 10; i++) {
            treeMap.put((int) (Math.random() * 10) + 1, (int) (Math.random() * 12) + 'A' + "");
        }

        System.out.println(treeMap);
        System.out.println(treeMap.subMap(3,8));
        System.out.println(treeMap.tailMap(5));
        System.out.println(treeMap.headMap(5));
    }

}
