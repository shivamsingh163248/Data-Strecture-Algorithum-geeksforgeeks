package Inheritence;

public class BankAccount extends Account {

	public BankAccount(int AccoutNumber, String AccountHolderName, String AccountHolderAddress) {
		super(AccoutNumber, AccountHolderName, AccountHolderAddress);
		
	}
	
	@Override
	public void AccountHolderPrint() {
		// calling the super Method 
		super.AccountHolderPrint();
	}
	
	public void AccountHolderPrint(int name) { // if the method same but  parameter is diff then it not showing any error
		// calling the super Method 
		System.out.println(name);
		super.AccountHolderPrint();
	}
	
	
	

}
