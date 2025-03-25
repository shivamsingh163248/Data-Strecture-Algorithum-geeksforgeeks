package Bank_operation;

public class TestBank {
	
	public static void main(String[] args) {
		
		   Bank sbi = new Bank("SBI");
	        
	        // First account
	        sbi.new_account("Shivam", 200, "Nadihar", 345674);
	        sbi.Print_account_Details();
	        sbi.user_account_details(345674);
	        System.out.println(sbi.total_account());
	        sbi.user_account_details(3456774);
	        sbi.deposit(345674, 34);
	        sbi.user_account_details(345674);
	        sbi.Withdraw(345674, 67);
	        sbi.user_account_details(345674);
	        sbi.Withdraw(345674, 200);
	        sbi.user_account_details(345674);
	        sbi.Withdraw(3456742, 67);
	        sbi.deposit(3456743, 34);
	        
	        // Second account
	        sbi.new_account("Amit", 500, "Delhi", 987654);
	        sbi.Print_account_Details();
	        sbi.user_account_details(987654);
	        System.out.println(sbi.total_account());
	        sbi.user_account_details(9876574);
	        sbi.deposit(987654, 100);
	        sbi.user_account_details(987654);
	        sbi.Withdraw(987654, 150);
	        sbi.user_account_details(987654);
	        sbi.Withdraw(987654, 500);
	        sbi.user_account_details(987654);
	        sbi.Withdraw(9876542, 100);
	        sbi.deposit(9876543, 50);
	        
	        // Third account
	        sbi.new_account("Rahul", 300, "Mumbai", 123456);
	        sbi.Print_account_Details();
	        sbi.user_account_details(123456);
	        System.out.println(sbi.total_account());
	        sbi.user_account_details(1234576);
	        sbi.deposit(123456, 75);
	        sbi.user_account_details(123456);
	        sbi.Withdraw(123456, 120);
	        sbi.user_account_details(123456);
	        sbi.Withdraw(123456, 300);
	        sbi.user_account_details(123456);
	        sbi.Withdraw(1234562, 80);
	        sbi.deposit(1234563, 90);
		
	}

}
