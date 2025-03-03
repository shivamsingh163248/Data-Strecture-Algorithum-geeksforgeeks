package Arrays;

import java.util.Scanner;

public class ArraysOperation {
	
	 // arrays insertion 
	public static int[] insertAsIndex(int num , int index , int[]arr) {
		// use the arrays and the manipulation of the code
		arr[index] = num ; 
		return arr ; 
		
	}
	public static int[] insertNext(int num , int[]arr) {
		// find the index where the arrays is the blank so i know the default values is 0 ; 
		// using the loop for the find the index 
		int index = 0 ; 
		for (int i = 0; i < arr.length; i++) {	
			if(arr[i] != 0 ) {
				index = i ; 
			}		
		}
		System.out.println(index);
		
		
		if(index == 0 ) {
			if(index+1 == arr.length) {
				// calling the dynamic arrays 
				arr = DynamicArrays(arr) ; 
				arr[index+1] = num ; 
				return arr ;
			}else {
				arr[index] = num ; 
				return arr ; 
			}
			
		}else {
			
			if(index+1 == arr.length) {
				// calling the dynamic arrays 
				arr = DynamicArrays(arr) ; 
				arr[index+1] = num ; 
				return arr ; 
			}
			arr[index+1] = num ; 
			return arr ; 
		}
		
		
		
	}
	
	public static int[] DynamicArrays(int[]arr) {
		// copy the arrays and creating the double size  and the returning the arrays 
		int Arrys_lenght = arr.length ; 
		// creating the new arrays of the double length
		int NewArrys[] = new int[Arrys_lenght*2] ; 
		// now copy the element 
		for (int i = 0; i < arr.length; i++) {
			NewArrys[i] = arr[i] ; 
		}
		return NewArrys ; 
	}
	
	// creating the deletion 
	public static int[] deletion(int[]arr , int index) {
		arr[index] = 0 ; 
		return arr ; 
	}
	
	// creating the searching element 
	public static int Searching(int[]arr , int num) {
		// hear creating the loop for the searching the element 
		int index = -1 ; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				index =  i ; 
			}
		}
		return index ; 
	}
	
	
	
	// creating the function print arrays 
	public static void  ArrysPrint(int[]arr) {
		// creating the loop for the print 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	// creating the function taking the input as the user of the arrays 
	public static int[] ArrysInput() {
		// creating the new arrays 
		System.out.println("Enter the size of the arrys ");
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		int arraySize = input.nextInt() ; 
		// creating the arrys 
		int[]arr = new int[arraySize] ; 
		
		// creating the loop of the taking the input of the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the number at index : "+ i);
			int number = input.nextInt() ; 
			arr[i] =  number ; 
		}
		return arr ; 
	}
	

	public static void main(String[] args) {
		
//		int[]input = ArrysInput() ;
//		ArrysPrint(input);
		System.out.println(" ");
		int[] shi = {0} ; 
		
		
		int[]next = insertNext(7,shi ) ; 
		ArrysPrint(next);

	}

}
