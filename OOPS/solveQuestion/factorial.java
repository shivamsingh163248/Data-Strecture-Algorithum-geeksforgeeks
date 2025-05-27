package solveQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class factorial {
	
	 public static List< Integer > printDivisors(int n) {
	        // Write your code here
			// creating list 
			List<Integer>result = new ArrayList<>();
			// creatng the loop 
			for (int i = 1; i < n/2+1; i++) {
			
				if (n%i == 0) {
					result.add(i) ; 
				}
			}
			result.add(n) ; 
			
	    }
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ; 
		int number = input.nextInt() ; 
		int reuslt = 1 ; 
		for (int i = number; i > 0 ; i--) {
			reuslt *= i ; 
		}
		
		
		
		
	}

}
