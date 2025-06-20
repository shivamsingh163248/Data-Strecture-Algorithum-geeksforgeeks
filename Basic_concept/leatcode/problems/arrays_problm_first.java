package leatcode.problems;

public class arrays_problm_first {
	
public static int findMaxConsecutiveOnesZeros(int[] nums) {
        
        // there is the input of the number 
	if (nums.length == 1) {
		return 1 ; 
	}
        int count = 0 ; 
        int privous_num = nums[0] ;  
    	int count_current_num  = 0  ; 
        
        // creating the loop for the count 
        for (int i = 0; i < nums.length; i++) {
        // creating the basic condtion 
        	if (privous_num == nums[i] ) {
				count_current_num++ ; 
			}else {
				// update the count in the main 
				if (count_current_num > count) {
					count = count_current_num ; 
				}
				privous_num = nums[i] ; 
				count_current_num = 1 ; 
			}
		}
        if (count_current_num > count) {
			count = count_current_num ; 
		}
        return count ; 
    }

// now create the logic only for the zero 
public static int findMaxConsecutiveOnes(int[] nums) {
	
	// creating the count 
	int count = 0 ; 
	int temporary_count = 0 ; 
	
	// creating the loop 
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 0 ) {
			// updating the temp count and create again zero
			// System.out.println(temporary_count);
			if (temporary_count > count) {
				count = temporary_count ;
				temporary_count = 0 ; 
			}
			
			temporary_count = 0 ; 
		}else {
			temporary_count++ ; 
		}
		
	}
	
    return count ; 

}

// Squares of a Sorted Array
public static int[] swep(int a , int b , int lenght ) {
	int[] new_int = new int[lenght] ; 
	int len = lenght ;
	if (b > a) {
		new_int[len]  = b; 
		len-- ; 
	}else {
		new_int[len]  = a; 
		len-- ; 
	}
	return new_int ; 
	
}

public static  String generateTag(String caption) {
	// create a string of the elelemt 
	String result_caption = "#" ; 
	int num = 0 ; 
    for(int i = 0 ; i < caption.length() ; i++){
    	// check the condition
    	// check for the space 
    	if (caption.charAt(i) == ' ' ) {
			num = 1 ; 
			continue ; 
		}
    	if (num == 1) {
    		// check for the capitol later and small later 
    		// check the latter is upperCase and lowercase 
    		if (caption.charAt(i) == Character.toLowerCase(caption.charAt(i))) {
				// change to upper 
    		String ch = 	Character.toString(caption.charAt(i)).toUpperCase() ; 
    		result_caption = result_caption+ch ; 
    		num = 0 ; 
    		continue ; 
    			
			}else {
	    		String ch = 	Character.toString(caption.charAt(i)).toLowerCase() ; 
	    		result_caption = result_caption+ch ; 
	    		num = 0 ; 
	    		continue  ; 
			}
    		
		}
    	
    	// create  a normal string and add in the string 
    	// using the method of the two string that convert into the string 
		String ch = 	Character.toString(caption.charAt(i)) ; 
		result_caption = result_caption+ch ; 
        
    }
    return result_caption ; 
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]  = {1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,0,0,0} ; 
		 // System.out.println(findMaxConsecutiveOnes(num));
		System.out.println(findMaxConsecutiveOnes(num));
		
		
		System.out.println(generateTag("my name is Shivam singh"));

	}

}
