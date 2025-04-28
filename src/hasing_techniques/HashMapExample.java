package hasing_techniques;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Traversal
        System.out.println("HashMap Elements:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        // Searching
        System.out.println("Contains Key 2: " + map.containsKey(2));
        System.out.println("Contains Value 'Mango': " + map.containsValue("Mango"));

        // Deletion
        map.remove(2);
        System.out.println("After removing key 2: " + map);
    }
}

