package Bank_operation;

public class TestBank {
	
	public static void main(String[] args) {

		Bank sbi = new Bank("SBI");
        sbi.new_account("Shivam", 200, "Nadihar", 345674);
        sbi.new_account("Amit", 500, "Delhi", 987654);
        sbi.new_account("Rahul", 300, "Mumbai", 123456);
        sbi.new_account("Priya", 400, "Kolkata", 765432);
        sbi.new_account("Vikram", 350, "Patna", 111111);
        sbi.new_account("Rohit", 600, "Ranchi", 222222);
        sbi.new_account("Swati", 450, "Jaipur", 333333);
        sbi.new_account("Pooja", 550, "Lucknow", 444444);
        sbi.new_account("Aditya", 700, "Kanpur", 555555);
        sbi.new_account("Simran", 650, "Nagpur", 666666);
        
        // HDFC Bank
        Bank hdfc = new Bank("HDFC");
        hdfc.new_account("Neha", 600, "Pune", 112233);
        hdfc.new_account("Ankit", 250, "Bangalore", 334455);
        hdfc.new_account("Sonia", 700, "Chennai", 556677);
        hdfc.new_account("Rahul", 500, "Hyderabad", 777777);
        hdfc.new_account("Ravi", 650, "Bhopal", 888888);
        hdfc.new_account("Sneha", 800, "Indore", 999999);
        hdfc.new_account("Ayesha", 350, "Vadodara", 101010);
        hdfc.new_account("Manoj", 550, "Surat", 202020);
        hdfc.new_account("Gaurav", 480, "Thane", 303030);
        hdfc.new_account("Deepika", 720, "Gurgaon", 404040);
        
        // ICICI Bank
        Bank icici = new Bank("ICICI");
        icici.new_account("Rohan", 800, "Hyderabad", 998877);
        icici.new_account("Karan", 450, "Jaipur", 776655);
        icici.new_account("Divya", 550, "Lucknow", 443322);
        icici.new_account("Sahil", 620, "Chandigarh", 505050);
        icici.new_account("Megha", 580, "Agra", 606060);
        icici.new_account("Vikas", 700, "Amritsar", 707070);
        icici.new_account("Kritika", 450, "Noida", 808080);
        icici.new_account("Suresh", 400, "Dehradun", 909090);
        icici.new_account("Rajesh", 350, "Shimla", 111222);
        icici.new_account("Komal", 650, "Mysore", 222333);
        
        // Perform operations on SBI accounts
        sbi.deposit(345674, 50);
        sbi.Withdraw(345674, 100);
        sbi.user_account_details(345674);
        sbi.deposit(987654, 75);
        sbi.Withdraw(987654, 200);
        sbi.user_account_details(987654);
        sbi.deposit(123456, 90);
        sbi.Withdraw(123456, 150);
        sbi.user_account_details(123456);
        sbi.deposit(765432, 120);
        sbi.Withdraw(765432, 180);
        sbi.user_account_details(765432);
        
        // Total accounts in SBI and check an invalid account
        System.out.println(sbi.total_account());
        sbi.user_account_details(3456774);
        
        // Perform operations on HDFC accounts
        hdfc.deposit(112233, 200);
        hdfc.Withdraw(112233, 150);
        hdfc.user_account_details(112233);
        hdfc.deposit(334455, 50);
        hdfc.Withdraw(334455, 100);
        hdfc.user_account_details(334455);
        hdfc.deposit(556677, 300);
        hdfc.Withdraw(556677, 400);
        hdfc.user_account_details(556677);
        
        // Perform operations on ICICI accounts
        icici.deposit(998877, 250);
        icici.Withdraw(998877, 200);
        icici.user_account_details(998877);
        icici.deposit(776655, 100);
        icici.Withdraw(776655, 50);
        icici.user_account_details(776655);
        icici.deposit(443322, 150);
        icici.Withdraw(443322, 100);
        icici.user_account_details(443322);
        
        // Print all account details
        sbi.Print_account_Details();
        hdfc.Print_account_Details();
        icici.Print_account_Details();
		    }
		}



