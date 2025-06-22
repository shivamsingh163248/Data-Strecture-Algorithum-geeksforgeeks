package leatcode.problems;

public class Double_square {
	
public static int[] sortedSquares(int[] nums) {   
     // create a new arrays 
	int result[] =  new int[nums.length] ; 
	// creating the for loop the for the square then start the shorting algorithm 
	for (int i = 0; i < nums.length; i++) {
		nums[i] *= nums[i] ; 
	}
	
	// now start the shorting 
	// creating the two pointer 
	int start = 0 ; 
	int end = nums.length - 1 ;
	int index = nums.length -1 ; 
	// now write the while loop for this operation 
	 while (start<= end) {
		 // check the condition fist  
		 if (nums[start] <= nums[end]) {
			result[index] = nums[end] ; 
			index -- ; 
			end-- ; 
		}
		 if (nums[start] >= nums[end]) {
			 result[index] = nums[start] ; 
				index -- ; 
				start++ ; 
		}
	}
	return result ; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
