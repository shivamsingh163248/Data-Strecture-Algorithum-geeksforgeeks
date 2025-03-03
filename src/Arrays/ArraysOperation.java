package Arrays;

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
		
		
		if(index == 0 ) {
			arr[index] = num ; 
			return arr ; 
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
	
	
	// creating the function print arrays 
	public static void  ArrysPrint(int[]arr) {
		// creating the loop for the print 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	// creating the function taking the input as the user of the arrays 
	
	

	public static void main(String[] args) {
		
		

	}

}
