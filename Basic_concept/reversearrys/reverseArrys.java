package reversearrys;

import java.util.Stack;

public class reverseArrys {
	
	// create the method 1 
	public int[] reverse_arrays_1(int[]arr) {
		
		// using the two pointer 
		// using the while loop method 
		int start = 0  ; 
		int end = arr.length -1 ; 
		
		// create a while loop 
		while (start < end) {
			// take a temp variable for the replacing 
			int temp = arr[start] ; 
			arr[start] = arr[end] ; 
			arr[end] = temp ; 
			
			// now increment variable 
			start++ ; 
			end -- ; 
			
		}
		
		return arr ; 
	}
	
	// creating the second method 
	public int[] reverse_arrays_2(int[]arr) {
		
		// creating the new arrys 
		int[]newarr = new int[arr.length] ; 
		// creating the for loop stored in the second arrays 
		for (int i = arr.length -1 ; i >= 0; i--) {
			newarr[arr.length-1 - i] =  arr[i] ; 
		}
		return newarr ; 
	}
	
	// creating the another method 
	// using the recursion 
	public int[] reverse_arrays(int[]arr) {
		 return reverse_arrays_2(arr, 0, arr.length -1 ) ; 
	}
	
	
    // creating the recursion 
	public int[] reverse_arrays_2(int[]arr , int start , int end) {
		
		// creating the base case 
		if (start<end) {
			return  arr ; 
		}
		
		int temp = arr[start] ; 
		arr[start] = arr[end] ; 
		arr[end] = temp ; 
		
		// now calling the function 
	    return reverse_arrays_2(arr, start+1, end-1) ; 
	    
	}
	
	// now implement using the stack 
	public int[] reverse_arrays_6(int[]arr ) {
		
		// creating the element push the element and pop the element 
		Stack<Integer>val = new Stack<>();
		
		// creating the for loop to insurt the element 
		for (Integer i : arr) {
			val.push(i) ; 
		}
		// now pop the elemtn 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = val.pop() ; 
		}
		return arr ; 
	}
	
	
}
