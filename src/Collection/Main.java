package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Collection -> turunan dari iterable
        // method .add(element), .get(index), .set(index, element), .remove(index), .size()
//        List<String> names = new ArrayList<>();
//        names.add("test1");
//        names.add("test2");
//        names.add("a");
//        names.set(0, "test terupdate");
//        Collections.sort(names);
//        System.out.println(names);

        // HashSet
//        Set<String> names = new HashSet<>();
//        names.add("Joni");
//        names.add("Budi");
//        names.add("Joni");
//        System.out.println(names);
//
//        Set<String> names2 = new HashSet<>();
//        names2.add("Handuk");
//        names2.add("Doremi");
//        System.out.println(names2);
//
//        Set<String> merged = new HashSet<>(names);
//        merged.addAll(names2);
//        System.out.println(merged);

        // HashMap
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 5);
        fruits.put("durian", 5);
        fruits.put("mangga", 5);
        fruits.put("rambutan", 5);
        System.out.println(fruits.get("mangga"));
        fruits.remove("apple");
        fruits.remove("durian");
        System.out.println(fruits);
        if (fruits.containsKey("durian")) {
            System.out.println("Durian");
        } else {
            System.out.println("Tidak ada");
        }
    }
}
