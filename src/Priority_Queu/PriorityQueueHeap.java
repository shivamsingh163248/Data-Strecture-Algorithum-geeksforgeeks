package Priority_Queu;

import java.util.PriorityQueue;

public class PriorityQueueHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap

        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(4);

        System.out.println("Priority Queue: " + pq);
        System.out.println("Deleted min: " + pq.poll()); // Removes smallest element
        System.out.println("Priority Queue after deletion: " + pq);
    }
}
