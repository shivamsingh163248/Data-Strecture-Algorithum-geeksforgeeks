package AccessModifire_AcessLavel_1;

import AccessModifire_AcessLavel_2.Solar_System;

import AccessModifire_AcessLavel_2.Universe;


public class water_animal extends Universe {
	
	// creating the private inner class and try the access 
	private class payment{
		int accountNumber  ; 
		String AccountName ; 
		
		private payment(int accountNumber , String AccountName  ) {
			
			this.AccountName = AccountName ; 
			this.accountNumber = accountNumber ; 
			
		}
		
		// creating the method private for the testing the access lavel 
		private void printDetail() {
			System.out.println(accountNumber+" "+AccountName);
		}
	}
   
	public water_animal() {

      Animal ai = new Animal(null, null) ; 
      
      // try to access the inner class 
      payment new1 = new payment(0, null) ; 
      // calling the methoed for the testing 
      new1.printDetail();
      
     
     
	}
	

	
	
	

 

	
	
   
}


