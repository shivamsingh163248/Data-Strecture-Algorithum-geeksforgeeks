package reversearrys;



public class basicio {
	

   
      public static void main(String[] args) {
    	 
    	  int[]a = {6,7,6,7} ; 
    	  int[]b = {4,5,6,5} ; 
    	  
    	  // print the both address 
    	  System.out.println(a +""+ b);
    	  
    	  int[]c = a ; 
    	  a = b ; 
    	  b =c ; 
    	  System.out.println(a +""+ b);    	  
    	  
    	  
	}

}
