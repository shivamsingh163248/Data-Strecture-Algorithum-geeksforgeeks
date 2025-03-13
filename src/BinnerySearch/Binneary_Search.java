package BinnerySearch;

import java.util.Scanner;

public class Binneary_Search {
	
	// Creating the function of the liner search 
	// taking the input from the user 
	public static <T>T[] taking_input(){
		return null;
	}
	public static int[] user_taking_input() {
		System.out.println("enter the size of the arrys ");
		Scanner input = new Scanner(System.in) ; 
		int n = input.nextInt() ; 
		// creating the loop 
		// creating the new arrays 
		int[]arr = new int[n] ; 
		for (int i = 0; i < arr.length; i++) {
			int val = input.nextInt() ; 
			arr[i] = val ; 
			
		}
		return arr ; 
	}

	public static <T> T userinput(T data) {
	  return data ; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(userinput(65));
	}

}
