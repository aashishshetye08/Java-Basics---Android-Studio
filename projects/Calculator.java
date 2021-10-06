package projects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2st Number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Operation (+,-,*,/)");
		char ch = sc.next().charAt(0);
		
		int res = 0;
		switch(ch) {
			case '+':
				res = num1 + num2;
				break;
			case '-':
				res = num1 - num2;
				break;
			case '*':
				res = num1 * num2;
				break;
			case '/':
				res = num1 / num2;
				break;
			default:
				System.out.println("Invalid Input");
		}
		System.out.println("Your Answer: "+res);
	}

}
