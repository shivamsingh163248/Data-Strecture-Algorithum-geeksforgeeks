package solveQuestion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumeven {
	
	public static void main(String[] args) {
		
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		int number = input.nextInt() ;
		int even = 0 ; 
		int odd = 0 ; 
		
		// now find the even and odd number 
		// creating the for loop 
		for (int i = number; i > 0 ; i = i/10) {
			
			// now find the reminder 
			int num= i%10 ; 
			// creating the condtion 
			if (num%2==0) {
				even+= num ; 
			} else {
				odd += num ; 

			}
			
		}
		System.out.println(even+" "+odd);
		
	
		
	}
	
	

}
