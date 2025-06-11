package Hasset;

import java.util.ArrayList;
import java.util.HashSet;

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
        if(( !isEmpty&& size > 0)&& check(value) ) {
        	 nodeData = new Node<>(key, value);
             arraydata.add(nodeData);
             isEmpty = false;
             size++;
             return true;
        }
        
        // if the size is more then the 0 and isEmpty is true we not add the same element 
        
        

        // Optional: You can add duplicate check or other logic here
        return false;
    }
    
    // creating the function check the values exit or not 
    private boolean check(Y values) {
    	// creating the loop that values are the exit or not 
    	for (Node<T, Y> node : arraydata) {
			
    		// creating the condition 
    		if (node.getValue().equals(values)) {
				return false ; 
			}
		}
    	return true ; 
    }

    // Additional getter methods (optional but useful)
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return arraydata.isEmpty(); // or return isEmpty;
    }

    public void getData() {
        
    	// creating the for loopEach loop and print all the data in the arrays 
    	for (Node<T, Y> node : arraydata) {
			System.out.println(node.getKey()+" :"+node.getValue());
		}
    }
    
    
    
}

