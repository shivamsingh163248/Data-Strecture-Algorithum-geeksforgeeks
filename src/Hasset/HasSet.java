package Hasset;

import java.util.ArrayList;

public class HasSet<T, Y> {
    // Create the dynamic array list to hold Node<T, Y> elements
    private ArrayList<Node<T, Y>> arraydata;
    private int size;
    private boolean isEmpty;
    private Node<T, Y> nodeData; // Use generic types properly

    // Constructor to initialize the list and fields
    public HasSet() {
        arraydata = new ArrayList<>();
        isEmpty = true;
        size = 0;
    }

    // Method to insert an element
    public boolean insert(T key, Y value) {
        // If the set is empty and size is 0, insert the element
        if (isEmpty && size == 0) {
            nodeData = new Node<>(key, value);
            arraydata.add(nodeData);
            isEmpty = false;
            size++;
            return true;
        }

        // Optional: You can add duplicate check or other logic here
        return false;
    }

    // Additional getter methods (optional but useful)
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return arraydata.isEmpty(); // or return isEmpty;
    }

    public ArrayList<Node<T, Y>> getData() {
        return arraydata;
    }
}

