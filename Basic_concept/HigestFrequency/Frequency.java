package HigestFrequency;

import java.util.Collection;
import java.util.HashMap;

public class Frequency {
	
	
// creating the method 
	public static int freuency(int[] arr) {
		
		// implementation using the hasmap 
		HashMap<Integer, Integer>fre = new HashMap<>() ; 
		// set the values in the hasmap 
		for (int i = 0; i < arr.length; i++) {
			
			if (fre.containsKey(arr[i]) ) {
				fre.put(arr[i], fre.get(arr[i])+1) ; 
				
			}else {
			fre.put(arr[i] ,1) ;
			} 
		}
		
		// checking frequency working perfectly or not 
		Collection<Integer> val = fre.values() ; 
		for (Integer i : val) {
			System.out.println(i);
		}
		
		// now find the maximum 
		
		
		
	  // crating the values find the maximum values
       int max = 0  ; 
       for (Integer i : val) {
		if (i > max) {
			// update the values 
			max = i  ; 
		}
	}
       
       return max  ; 
	   
	}
	
	// creating the main function 
	public static void main(String[] args) {
		
		int[]arr = {4,5,6,7,8,6,5,4,3,2,3,4,5,6,7,8,9,78,6,5,4,4,5,6,78,8,89,7,6,4,3,2,5,6,7,8,9};
		freuency(arr) ; 
		System.out.println("max values is "+freuency(arr));
		
	}

}
