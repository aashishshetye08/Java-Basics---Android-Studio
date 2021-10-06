package project_BankAccount;

public class InsufficientBalance extends Exception{

	private String message;

//	Constuctor
	public InsufficientBalance(String message) {
		this.message = message;
	}

//	getter method
	public String getMessage() {
		return message;
	}
	
}
