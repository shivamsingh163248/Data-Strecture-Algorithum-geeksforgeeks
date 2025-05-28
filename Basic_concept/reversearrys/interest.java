package reversearrys;

import java.util.Scanner;

public class interest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ; 
		int n  = input.nextInt() ; 
		float rate = input.nextFloat() ; 
		int time = input.nextInt() ; 
		
		
//		The input is principal=2000, rate=2.2 and time=4.
//				So Simple interest=Principal*rate*time/100 hence 
//				answer is 2000*2.2*4/100=176
		
	 double interest = (n*rate*time)/100 ; 
	 
	 

}
}
