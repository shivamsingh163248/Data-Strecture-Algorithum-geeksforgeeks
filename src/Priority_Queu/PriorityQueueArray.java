package Priority_Queu;

import java.util.Arrays;

public class PriorityQueueArray {
    private int[] arr;
    private int size;

    public PriorityQueueArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        arr[size++] = value;
    }

    public int deleteMax() { // Max-priority queue
        if (size == 0) return -1;
        int maxIdx = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }

        int maxVal = arr[maxIdx];
        arr[maxIdx] = arr[--size]; // Replace max with last element
        return maxVal;
    }

    public void printQueue() {
        System.out.println("Queue: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

    public static void main(String[] args) {
        PriorityQueueArray pq = new PriorityQueueArray(5);
        pq.insert(3);
        pq.insert(5);
        pq.insert(1);
        pq.insert(4);

        pq.printQueue();
        System.out.println("Deleted max: " + pq.deleteMax());
        pq.printQueue();
    }
}
