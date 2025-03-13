package Basic_I;

import java.util.Scanner;

public class farenhight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ; 
		// taking the three input 
		 int start = input.nextInt() ; 
		 int end = input.nextInt() ; 
		 int step = input.nextInt() ; 
		 
		 
		 // creating the loop printing the f to c 
		 for (int i = start; i <= end; i = i+step) {
			
			 int c = (i - 32) * (5/9);
			 System.out.println(i+" "+c);
			
		}
	}

}
