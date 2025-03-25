package Bank_operation;

public class TestBank {
	
	public static void main(String[] args) {
		
		// creating the object of sbi 
		Bank sbi = new Bank("sbi") ; 
		
		// now create a account 
		sbi.new_account("shivam", 200, "nadihar", 345674);
		
		// now print 
		sbi.Print_account_Details();
		sbi.user_account_details(345674);
		sbi.total_account() ; 
		System.out.println(sbi.total_account() );
		sbi.user_account_details(3456774);
		sbi.deposit(345674, 34);
		sbi.user_account_details(345674);
		sbi.Withdraw(345674, 67);
		sbi.user_account_details(345674);
		sbi.Withdraw(345674, 200);
		sbi.user_account_details(345674);
		sbi.Withdraw(3456742, 67);
		sbi.deposit(3456743, 34);
		
	}

}
