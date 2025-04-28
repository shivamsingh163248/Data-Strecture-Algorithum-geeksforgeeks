package hasing_techniques;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Insertion
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        // Traversal
        System.out.println("HashSet Elements:");
        for (String color : set) {
            System.out.println(color);
        }

        // Searching
        System.out.println("Contains 'Green': " + set.contains("Green"));

        // Deletion
        set.remove("Green");
        System.out.println("After removing 'Green': " + set);
    }
}

