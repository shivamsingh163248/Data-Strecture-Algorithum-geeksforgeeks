package dynamic_arrays;

import java.util.Arrays;

class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray() {
        array = new int[2]; // Start with small initial capacity
        size = 0;
        capacity = 2;
    }

    // Resize array when needed
    private void resize() {
        capacity = capacity * 2;
        array = Arrays.copyOf(array, capacity);
    }

    // Insert element
    public void insert(int value) {
        if (size == capacity) {
            resize();
        }
        array[size++] = value;
    }

    // Delete element at index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Search for an element
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Traverse and display elements
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Update element at a specific index
    public void update(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        array[index] = value;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.insert(10);
        da.insert(20);
        da.insert(30);
        da.insert(40);
        
        System.out.print("Array after insertion: ");
        da.traverse();

        da.delete(1);
        System.out.print("Array after deletion at index 1: ");
        da.traverse();

        int index = da.search(30);
        System.out.println("Searching 30: Found at index " + index);

        da.update(1, 35);
        System.out.print("Array after updating index 1 to 35: ");
        da.traverse();
    }
}
