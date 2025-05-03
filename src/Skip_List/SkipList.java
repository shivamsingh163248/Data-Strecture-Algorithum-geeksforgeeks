package Skip_List;

import java.util.Random;

//Node class representing an element in the Skip List
class Node {
 int value;
 Node[] forward; // Array of forward pointers

 public Node(int value, int level) {
     this.value = value;
     this.forward = new Node[level + 1]; // 0 to level
 }
}

//Skip List class
class SkipList {
 private static final int MAX_LEVEL = 4;
 private final float P = 0.5f;
 private int level = 0;
 private final Node head = new Node(-1, MAX_LEVEL); // dummy head

 private final Random random = new Random();

 // Function to generate a random level for a new node
 private int randomLevel() {
     int lvl = 0;
     while (random.nextFloat() < P && lvl < MAX_LEVEL) {
         lvl++;
     }
     return lvl;
 }

 // Insertion in skip list
 public void insert(int value) {
     Node[] update = new Node[MAX_LEVEL + 1];
     Node current = head;

     // Start from top level and move down to find position to insert
     for (int i = level; i >= 0; i--) {
         while (current.forward[i] != null && current.forward[i].value < value) {
             current = current.forward[i];
         }
         update[i] = current;
     }

     int newLevel = randomLevel();

     if (newLevel > level) {
         for (int i = level + 1; i <= newLevel; i++) {
             update[i] = head;
         }
         level = newLevel;
     }

     Node newNode = new Node(value, newLevel);

     for (int i = 0; i <= newLevel; i++) {
         newNode.forward[i] = update[i].forward[i];
         update[i].forward[i] = newNode;
     }

     System.out.println("Inserted: " + value);
 }

 // Search in skip list
 public boolean search(int value) {
     Node current = head;

     for (int i = level; i >= 0; i--) {
         while (current.forward[i] != null && current.forward[i].value < value) {
             current = current.forward[i];
         }
     }

     current = current.forward[0];

     if (current != null && current.value == value) {
         return true;
     } else {
         return false;
     }
 }

 // Delete a node from the skip list
 public void delete(int value) {
     Node[] update = new Node[MAX_LEVEL + 1];
     Node current = head;

     for (int i = level; i >= 0; i--) {
         while (current.forward[i] != null && current.forward[i].value < value) {
             current = current.forward[i];
         }
         update[i] = current;
     }

     current = current.forward[0];

     if (current != null && current.value == value) {
         for (int i = 0; i <= level; i++) {
             if (update[i].forward[i] != current) break;
             update[i].forward[i] = current.forward[i];
         }

         while (level > 0 && head.forward[level] == null) {
             level--;
         }

         System.out.println("Deleted: " + value);
     } else {
         System.out.println("Value not found: " + value);
     }
 }

 // Print the skip list
 public void display() {
     System.out.println("Skip List:");
     for (int i = level; i >= 0; i--) {
         Node current = head.forward[i];
         System.out.print("Level " + i + ": ");
         while (current != null) {
             System.out.print(current.value + " ");
             current = current.forward[i];
         }
         System.out.println();
     }
 }
}
