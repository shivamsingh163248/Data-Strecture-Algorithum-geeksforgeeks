package LISTOPERATION_CHATGPT;

import java.util.*;

public class ArrayVsLinkedList {
    public static void main(String[] args) {
        System.out.println("Performance Comparison: Array vs Linked List");
        
        // Array Operations
        System.out.println("\n--- ARRAY OPERATIONS ---");
        List<Integer> arrayList = new ArrayList<>();
        
        long startTime = System.nanoTime();
        arrayList.add(0, 10);  // Insertion at the beginning (O(n))
        arrayList.add(20);      // Insertion at the end (O(1))
        arrayList.add(1, 15);   // Insertion at middle (O(n))
        long endTime = System.nanoTime();
        System.out.println("Insertion Time (Array): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        arrayList.remove(0);  // Deletion at the beginning (O(n))
        arrayList.remove(1);  // Deletion in the middle (O(n))
        arrayList.remove(arrayList.size() - 1); // Deletion at the end (O(1))
        endTime = System.nanoTime();
        System.out.println("Deletion Time (Array): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        arrayList.contains(15);  // Searching (O(n))
        endTime = System.nanoTime();
        System.out.println("Search Time (Array): " + (endTime - startTime) + " ns");

        // Linked List Operations
        System.out.println("\n--- LINKED LIST OPERATIONS ---");
        LinkedList<Integer> linkedList = new LinkedList<>();

        startTime = System.nanoTime();
        linkedList.addFirst(10);  // Insertion at the beginning (O(1))
        linkedList.addLast(20);   // Insertion at the end (O(1))
        linkedList.add(1, 15);    // Insertion at middle (O(n))
        endTime = System.nanoTime();
        System.out.println("Insertion Time (Linked List): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.removeFirst();  // Deletion at the beginning (O(1))
        linkedList.remove(1);  // Deletion in the middle (O(n))
        linkedList.removeLast(); // Deletion at the end (O(1))
        endTime = System.nanoTime();
        System.out.println("Deletion Time (Linked List): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.contains(15);  // Searching (O(n))
        endTime = System.nanoTime();
        System.out.println("Search Time (Linked List): " + (endTime - startTime) + " ns");
    }
}

