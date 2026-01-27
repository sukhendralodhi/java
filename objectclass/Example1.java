package objectclass;

import java.util.ArrayList;
import java.util.HashSet;

public class Example1 {
    public static void main(String[] args) {
        // ArrayList<String> names = new ArrayList<>();
        // names.add("Ram");
        // names.add("Mohan");
        // names.add("Deepak");

        // for(String name : names) {
        // System.out.println(name);
        // }

        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // Duplicate
        cars.add("Mazda");
        for (String name : cars) {
            System.out.println(name);
        }
    }
}
