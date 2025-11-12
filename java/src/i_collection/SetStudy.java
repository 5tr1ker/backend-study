package i_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;

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
//        for(int z = 0; z < 10; z++) {
//            HashSet<Integer> set = new HashSet<>();
//            LinkedHashSet<Integer> set = new LinkedHashSet<>();
//            for(int i = 0; i < 10; i++) {
//                set.add((int) (Math.random() * 5) + 1);
//            }
//
//            System.out.println(set);
//        }

        HashSet<Person> people = new HashSet<>();
        for(int i = 0; i < 10; i++) {
            Person person = new Person((int) (Math.random() * 5) + 1,"People");
            people.add(person);
        }

        System.out.println(people);
    }

}
