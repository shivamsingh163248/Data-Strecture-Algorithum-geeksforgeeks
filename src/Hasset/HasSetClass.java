package Hasset;

import java.io.Console;

public class HasSetClass {
	// created the main class 
	public static void main(String[] args) {
		
		// create the object of the hasSet
		HasSet<Integer, Integer>map = new HasSet<Integer, Integer>() ; 
		
		System.out.println(map.insert(2, 3));
		map.insert(4, 6) ; 
		map.insert(5, 3) ;
		System.out.println(map.insert(5, 3) );
	    System.out.println(map.getSize());
	    map.getData();
	    
	    
	    // creating the second object one is 
	    HasSet<Integer, String>map1 = new HasSet<Integer, String>() ; 
	    HasSet<String, Integer>map2 = new HasSet<String, Integer>() ; 
	    // creating the type of the string and string 
	    System.out.println("shivam".hashCode());
	}

}
