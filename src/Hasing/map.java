package Hasing;

import java.util.ArrayList;

public class map<T ,K> {
	
// creating the arrays list of the bucket 
 // creating the private 
	private ArrayList<map<T, K>>bucket; 
	private int count ; 
	private int numbucket ; 
	
	// creating constructor 
	public map() {
		numbucket = 20 ; 
		// crating the over the loop 
		bucket = new ArrayList<>() ;
		for (int i = 0; i < numbucket; i++) {
			// now set the null of the every object 
			
					bucket.add(null) ; 
			
		}
	}
	
	
	private int  findIndex(K key) {
		
		return count;
		
	}
	
	

}
