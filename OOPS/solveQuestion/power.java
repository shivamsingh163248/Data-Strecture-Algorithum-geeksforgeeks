package solveQuestion;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ; 
		int a = input.nextInt() ; 
		int b = input.nextInt() ; 
		
		// now creating the the power using
		int result = 1; 
		for (int i = 0; i < b; i++) {
			result *= a ; 
		}
		return ; 
	}

}
