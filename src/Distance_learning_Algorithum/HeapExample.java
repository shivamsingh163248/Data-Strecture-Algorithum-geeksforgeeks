// Main Heap class
package Distance_learning_Algorithum;
class Heap {
    protected int[] heap;
    protected int size;
    protected int capacity;

    public Heap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    protected int parent(int i) {
    	return (i - 1) / 2;
    	}
    protected int leftChild(int i) {
    	return 2 * i + 1; 
    	}
    protected int rightChild(int i) {
    	return 2 * i + 2; 
    	}

    protected void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

// MaxHeap Implementation
class MaxHeap extends Heap {

    public MaxHeap(int capacity) {
        super(capacity);
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap full!");
            return;
        }
        heap[size] = value;
        int current = size;
        size++;

        while (current != 0 && heap[parent(current)] < heap[current]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMax() {
        if (size <= 0) return Integer.MIN_VALUE;
        if (size == 1) return heap[--size];

        int root = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);

        return root;
    }

    private void maxHeapify(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] > heap[largest])
            largest = left;

        if (right < size && heap[right] > heap[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }
}

// MinHeap Implementation
class MinHeap extends Heap {

    public MinHeap(int capacity) {
        super(capacity);
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap full!");
            return;
        }
        heap[size] = value;
        int current = size;
        size++;

        while (current != 0 && heap[parent(current)] > heap[current]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMin() {
        if (size <= 0) return Integer.MAX_VALUE;
        if (size == 1) return heap[--size];

        int root = heap[0];
        heap[0] = heap[--size];
        minHeapify(0);

        return root;
    }

    private void minHeapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] < heap[smallest])
            smallest = left;

        if (right < size && heap[right] < heap[smallest])
            smallest = right;

        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }
}

// Heap Sort using MaxHeap
class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(arr, n, i);

        // Extract elements one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call maxHeapify on reduced heap
            maxHeapify(arr, i, 0);
        }
    }

    private static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            maxHeapify(arr, n, largest);
        }
    }
}

// Priority Queue using MinHeap
class PriorityQueueHeap {
    private MinHeap minHeap;

    public PriorityQueueHeap(int capacity) {
        minHeap = new MinHeap(capacity);
    }

    public void enqueue(int value) {
        minHeap.insert(value);
    }

    public int dequeue() {
        return minHeap.extractMin();
    }

    public boolean isEmpty() {
        return minHeap.size == 0;
    }
}

// Driver class to test everything
public class HeapExample {
    public static void main(String[] args) {
        System.out.println("MaxHeap:");
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(3);
        maxHeap.insert(10);
        maxHeap.insert(5);
        System.out.println("Extracted Max: " + maxHeap.extractMax());

        System.out.println("\nMinHeap:");
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(8);
        minHeap.insert(2);
        minHeap.insert(15);
        System.out.println("Extracted Min: " + minHeap.extractMin());

        System.out.println("\nHeapSort:");
        int[] array = {4, 10, 3, 5, 1};
        HeapSort.heapSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nPriority Queue using MinHeap:");
        PriorityQueueHeap pq = new PriorityQueueHeap(10);
        pq.enqueue(20);
        pq.enqueue(5);
        pq.enqueue(15);
        while (!pq.isEmpty()) {
            System.out.print(pq.dequeue() + " ");
        }
    }
}
