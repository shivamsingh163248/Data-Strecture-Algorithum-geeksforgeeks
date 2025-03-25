package Bank_operation;

import java.util.ArrayList;

public class Bank {
	
	// creating the arrays to set the new account 
// 	private Bnak_User[]user_account   ; 
	// creating the arrys list for the dynamic 
	private ArrayList<Bnak_User>user_account ;
	private String Bank_name ; 
	public Bank(String bank_name) {
		this.Bank_name = bank_name ; 
		user_account = new ArrayList<>() ; 
	}
	
	// creating the new account of the user 
	// creating the method the new account 
	public void new_account(String user_name, int user_amount, String user_address , int account_number ) {
		
		// creating the new_obj and set in the arrays 
		Bnak_User new_bank_user = new Bnak_User(user_name, user_amount, user_address , account_number) ; 
		user_account.add(new_bank_user) ; 
		
		
	}
	
	// now print the total account 
	public int total_account() {
		return user_account.size() ; 
	}
	
	// creating the method print total account details 
	public  void Print_account_Details() {
		
		// create a the for each loop 
		for (Bnak_User bnak_User : user_account) {
			
			System.out.println("Account_number : "+bnak_User.getAccount_number()+" Account_name : "+bnak_User.getUser_name()+"  Account_balnace : "+bnak_User.Current_Amount());
		}
		
		
	}
	
	// find the account input 
	public void user_account_details(int account_number) {
		
		// check in the arrys if the present or not if present the print the details other wise not found 
		// using the try catch 
		try {
//			if (user_account.contains(user_account)) {
//				
//			}
			
			
			// save the object 
			Bnak_User obj = null ; 
			
			
			// using the for each loop to find the account details 
			for (Bnak_User bnak_User : user_account) {
				if(bnak_User.getAccount_number() == account_number) {
					
					// print all the details 
					System.out.println("Account_number : "+bnak_User.getAccount_number()+" Account_name : "+bnak_User.getUser_name()+"  Account_balnace : "+bnak_User.Current_Amount());
				    obj = bnak_User ; 
				    return  ; 
				
				}
			}
			
			System.out.println(user_account.contains(obj));
			System.out.println("account number not found ");
			
			
			
		} catch (Exception e) {
			
			System.out.println("not found ");
		}
	}
	
	
	private Bnak_User find_Account_number(int Account_number) {
		
		// creating the for each loop find the object 
		for (Bnak_User bnak_User : user_account) {
			
			// creating the condition 
			if (bnak_User.getAccount_number() == Account_number ) {
				return bnak_User ; 
			}	
		}
		System.out.println("Not found ");
		return null ; 
	}
	
	
	// now creating the function to deposit and withdraw 
	
	public void deposit(int Account  , int Amount ) {
		
		// creating  the exception hadaling 
		try {
			
			// calling the function 
			Bnak_User user = find_Account_number(Account);
			// calling the function 
			user.Deposit_Amount(Amount);
			
		} catch (Exception e) {
			
			System.out.println("Not find account number ");
		}
	}
	
	public void Withdraw(int Account  , int Amount ) {
		
		// creating  the exception hadaling 
		try {
			
			// calling the function 
			Bnak_User user = find_Account_number(Account);
			// calling the function 
			user.Widrawl_Amount(Amount);
			
		} catch (Exception e) {
			
			System.out.println("Not find account number ");
		}
	}
	

}
