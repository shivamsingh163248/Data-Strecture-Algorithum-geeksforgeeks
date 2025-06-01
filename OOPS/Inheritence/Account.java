package Inheritence;

import java.util.Objects;

public class Account {
	
	public int getAccoutNumber() {
		return AccoutNumber;
	}

	public void setAccoutNumber(int accoutNumber) {
		AccoutNumber = accoutNumber;
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public String getAccountHolderAddress() {
		return AccountHolderAddress;
	}

	public void setAccountHolderAddress(String accountHolderAddress) {
		AccountHolderAddress = accountHolderAddress;
	}

	@Override
	public String toString() {
		return "Account [AccoutNumber=" + AccoutNumber + ", AccountHolderName=" + AccountHolderName
				+ ", AccountHolderAddress=" + AccountHolderAddress + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(AccountHolderAddress, AccountHolderName, AccoutNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(AccountHolderAddress, other.AccountHolderAddress)
				&& Objects.equals(AccountHolderName, other.AccountHolderName) && AccoutNumber == other.AccoutNumber;
	}

	// creating the construtor 
	private int AccoutNumber ; 
	private String AccountHolderName ; 
	private String AccountHolderAddress  ; 
	
	public Account( int AccoutNumber , String AccountHolderName  ,  String AccountHolderAddress  ) {
		
		// now initialize the variable 
		this.AccountHolderAddress = AccountHolderAddress ; 
		this.AccountHolderName =  AccountHolderName ; 
		this.AccoutNumber = AccoutNumber ; 
	

	}
	
	// creating the method and the 
	public void AccountHolderPrint() {
		System.out.println(AccoutNumber+" "+AccountHolderAddress+" "+AccountHolderName);
	}
	

}
