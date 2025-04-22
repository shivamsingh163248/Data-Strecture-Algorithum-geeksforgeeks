package Hasset;

import java.util.HashSet;
import java.util.Iterator;


public class Hasset {
	public static void main(String[] args) {
		HashSet<Integer>new_set = new HashSet<>() ; 
		new_set.add(1) ; 
		new_set.add(1) ; 
		new_set.add(2) ; 
		new_set.add(3) ;
		new_set.add(4) ;
		
		// now check the print of the size 
		System.out.println(new_set.size());
		System.out.println(new_set.contains(3));
		System.out.println(new_set.hashCode());
		
		System.out.println(new_set);
		
	   
		
		Iterator<Integer> it = new_set.iterator() ; 
		
		// now hear is 
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
//		
	System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
//		
//		System.out.println(it.hasNext()); 
	}
	
	
	
	

}
