package Arrays;

import java.util.Arrays;

public class ArrayOperations {
    private int[] arr;
    private int size;

    public ArrayOperations(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Insertion
    public void insert(int index, int value) {
        if (size == arr.length) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    // Deletion
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Searching (Linear Search)
    public int linearSearch(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Searching (Binary Search - Assumes Sorted Array)
    public int binarySearch(int value) {
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] < value)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // Traversing
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Updating
    public void update(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        arr[index] = value;
    }

    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations(10);
        arrayOps.insert(0, 5);
        arrayOps.insert(1, 10);
        arrayOps.insert(2, 15);
        arrayOps.insert(1, 20); // Insert at index 1
        
        System.out.print("Array after insertion: ");
        arrayOps.traverse();
        
        arrayOps.delete(2);
        System.out.print("Array after deletion: ");
        arrayOps.traverse();
        
        int searchIndex = arrayOps.linearSearch(10);
        System.out.println("Linear Search: Element 10 found at index " + searchIndex);
        
        arrayOps.update(1, 25);
        System.out.print("Array after update: ");
        arrayOps.traverse();
    }
}



