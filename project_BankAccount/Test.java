package project_BankAccount;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		BankAccount acc = new BankAccount();
		Scanner inn = new Scanner(System.in);
		int ch;
		
		do {
			System.out.print("\n -----Bank Account Menu-----");
			System.out.print("\n 1.Deposit");
			System.out.print("\n 2.withdraw");
			System.out.print("\n 3.Show Curretn Balance");
			System.out.print("\n 4.Quit");
			System.out.print("\n Your Choice : ");
			ch = inn.nextInt();
			switch(ch) {
				case 1 :
					System.out.print("\n Enter Amount : ");
					acc.deposit(inn.nextDouble());
					System.out.println("Current Balance : " + acc.getBalance());
					break;
				case 2 :
					System.out.println("Current Balance : " + acc.getBalance());
					System.out.print("\n Enter Amount : ");
					try {
						acc.withdraw(inn.nextDouble());
					} catch (InsufficientBalance e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3 :
					System.out.println("Current Balance : "+acc.getBalance());
					break;
				case 4 :
					System.out.println("Jai Hind");
					break;
				default : 
					System.out.println("Invalid Option, Try Agian");
					break;		
			}
		}while(ch != 4);
		
		
	}

}
