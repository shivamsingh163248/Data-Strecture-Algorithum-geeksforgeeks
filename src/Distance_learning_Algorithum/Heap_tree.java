package Distance_learning_Algorithum;

import java.util.LinkedList;
import java.util.Queue;

//Node class for the tree
class Node {
 int value;
 Node left, right, parent;

 public Node(int value) {
     this.value = value;
     left = right = parent = null;
 }
}

//Priority Queue using Binary Tree (Min Heap)
class PriorityQueueTree {
 private Node root;
 private int size;

 public PriorityQueueTree() {
     root = null;
     size = 0;
 }

 // Insert value into tree
 public void enqueue(int value) {
     Node newNode = new Node(value);
     size++;

     if (root == null) {
         root = newNode;
         return;
     }

     // Find the correct position using BFS (level-order)
     Queue<Node> queue = new LinkedList<>();
     queue.add(root);

     while (!queue.isEmpty()) {
         Node current = queue.poll();

         if (current.left == null) {
             current.left = newNode;
             newNode.parent = current;
             heapifyUp(newNode);
             break;
         } else {
             queue.add(current.left);
         }

         if (current.right == null) {
             current.right = newNode;
             newNode.parent = current;
             heapifyUp(newNode);
             break;
         } else {
             queue.add(current.right);
         }
     }
 }

 // Remove and return the minimum value (root)
 public int dequeue() {
     if (root == null) {
         throw new RuntimeException("Queue is empty");
     }

     int minValue = root.value;

     if (size == 1) {
         root = null;
         size--;
         return minValue;
     }

     // Find last node
     Node lastNode = getLastNode();
     
     // Replace root value with last node's value
     root.value = lastNode.value;

     // Remove last node
     if (lastNode.parent.right == lastNode) {
         lastNode.parent.right = null;
     } else {
         lastNode.parent.left = null;
     }

     size--;

     // Heapify Down
     heapifyDown(root);

     return minValue;
 }

 public boolean isEmpty() {
     return root == null;
 }

 private void heapifyUp(Node node) {
     while (node.parent != null && node.value < node.parent.value) {
         int temp = node.value;
         node.value = node.parent.value;
         node.parent.value = temp;

         node = node.parent;
     }
 }

 private void heapifyDown(Node node) {
     while (node != null) {
         Node smallest = node;

         if (node.left != null && node.left.value < smallest.value) {
             smallest = node.left;
         }

         if (node.right != null && node.right.value < smallest.value) {
             smallest = node.right;
         }

         if (smallest != node) {
             int temp = node.value;
             node.value = smallest.value;
             smallest.value = temp;

             node = smallest;
         } else {
             break;
         }
     }
 }

 // Find the last node in level-order
 private Node getLastNode() {
     Queue<Node> queue = new LinkedList<>();
     queue.add(root);

     Node lastNode = null;
     while (!queue.isEmpty()) {
         lastNode = queue.poll();
         if (lastNode.left != null) queue.add(lastNode.left);
         if (lastNode.right != null) queue.add(lastNode.right);
     }

     return lastNode;
 }

 // For testing - In-order traversal
 public void inOrderTraversal(Node node) {
     if (node == null) return;
     inOrderTraversal(node.left);
     System.out.print(node.value + " ");
     inOrderTraversal(node.right);
 }

 public Node getRoot() {
     return root;
 }
}

//Driver class
public class Heap_tree {
 public static void main(String[] args) {
     PriorityQueueTree pq = new PriorityQueueTree();
     
     pq.enqueue(10);
     pq.enqueue(4);
     pq.enqueue(15);
     pq.enqueue(2);
     pq.enqueue(7);

     System.out.println("In-Order Traversal:");
     pq.inOrderTraversal(pq.getRoot());
     System.out.println();

     System.out.println("\nDequeue operations:");
     while (!pq.isEmpty()) {
         System.out.println("Dequeued: " + pq.dequeue());
     }
 }
}
