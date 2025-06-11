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
	    HasSet<String, String>map3 = new HasSet<String, String>() ; 
	    // creating the type of the string and string 
	    // check the size and check for the isEmpty or not 
	    
	    System.out.println(map1.insert(1, "shivam"));
	    System.out.println(map1.insert(2, "itisha"));
	    System.out.println(map1.insert(3, "lovely"));
	    System.out.println(map1.insert(4, "shivam"));
	    System.out.println(map1.insert(5, "itisha"));
	    map1.getData();
	    System.out.println(map1.getSize());
	    System.out.println("shivam".hashCode());
	    System.out.println(map3.isEmpty());
	    System.out.println(map3.insert("class1", "shivam"));
	    System.out.println(map3.insert("class1", "itisha"));
	    System.out.println(map3.insert("class3", "lovely"));
	    System.out.println(map3.insert("class1", "shivam"));
	    System.out.println(map3.insert("class2", "itisha"));
	    map3.getData();
	    System.out.println(map3.getSize());
	    System.out.println("shivam".hashCode());
	}

}
