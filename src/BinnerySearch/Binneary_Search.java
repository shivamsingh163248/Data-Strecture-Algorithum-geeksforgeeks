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
	
	// function to binary search 
	public static int binnary_search(int[]arr , int target) {
		
		// find the length of the arrays 
		int right = arr.length -1 ; 
		int left = 0 ; 
		// find the mid 
	 // creating the over flow 
		
		
		// creating the loop left and right greater and equal to    
		while (left <= right) {
			int mid = left + (right - left) / 2  ;
			System.out.println("laft : "+left+"  right : "+right+"   mid :"+mid);
			// creating condition to update 
			if (arr[mid] == target) {
				return mid ; 
			}else if(arr[mid] < target) {
				left = mid+1 ; 
			}else {
				right = mid-1 ; 
			}
			 
			
			
			
		}
		return -1 ; 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(userinput(65));
       // calling the function 
       int[]arr = {1,2,3,4,5,6,7,8,9} ; 
     int val =    binnary_search(arr, 9) ; 
     System.out.println(val);
	}

}
