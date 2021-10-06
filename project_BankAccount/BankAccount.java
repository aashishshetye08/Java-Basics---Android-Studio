package project_BankAccount;

public class BankAccount {

	private double balance;
	
//	Constructor
	public BankAccount() {
		balance = 0;
	}
	
//	Deposit
	public void deposit (double amount) {
		balance += amount;
	}
	
//	Withdraw
	public void withdraw (double amount) throws InsufficientBalance {
		if(amount > balance) {
			throw new InsufficientBalance("Insufficient Balance. Transaction Failed");
		}
		balance -= amount;
	}

//	getter method for balance
	public double getBalance() {
		return balance;
	}
		
}