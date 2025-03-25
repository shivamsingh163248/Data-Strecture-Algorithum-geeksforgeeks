package Bank_operation;

public class Bnak_User {
	

	// bank user have the
	private String user_name ; 
	private int user_amount ; 
	private String user_address ;
	private int account_number ; 
	
	
	public Bnak_User(String user_name, int user_amount, String user_address  , int account_number) {
		this.account_number = account_number  ; 
		this.user_name = user_name;
		this.user_amount = user_amount;
		this.user_address = user_address;
	} 
	
	
	// creating the getter and setter method to set the amount 
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	
	// now creating the function to deposit the 
	public void Deposit_Amount(int Amount) {
		this.user_amount += Amount ; 
		System.out.println("Successful deposit");
	}
	
	public void Widrawl_Amount(int Amouunt) {
		
		// creating the try catch 
		try {
			// creating the condition to checking the amount 
			if (this.user_amount < Amouunt) {
				// printing the not widrawl 
				System.err.println("you have not a enouth ");	
			}else {
				this.user_amount -= Amouunt ;
				System.out.println("Successful Withdrwl amount");
			}
			
		} catch (Exception e) {
			System.out.println("you have the some error ");
		}
	}
	
	// creating the method to print amount 
	public int Current_Amount() {
		return this.user_amount ; 
	}


	public int getAccount_number() {
		return account_number;
	}
	
	

}
