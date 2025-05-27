package solveQuestion;

import java.util.Scanner;

public class binnary_number {
	
	// creatng the function to convert number in the binnary 
	public static String binnery(int num ) {
		int i = num ; 
		String number = "" ; 
		while(i > 1) {
			// System.out.println(i+" "+i%2);
			int a = i%2 ; 
			number = a+number ; 
			i = i/2 ; 
		}
		number = i+number ; 
		// System.out.println(number);
		return number ; 
		
	}

	public static void main(String[] args) {
		
		
     // creating binary number of n 
		for (int i = 0; i < 10; i++) {
			System.out.println("binnary : "+i+" is : "+binnery(i));
		}
	
	
		

	}

}
