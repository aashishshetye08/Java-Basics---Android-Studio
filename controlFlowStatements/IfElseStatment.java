package controlFlowStatements;

import java.util.Scanner;

public class IfElseStatment {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a no : ");
		int a = sc.nextInt();
		if (a%2 == 0) 
			System.out.println("No is even");
		else
			System.out.println("No is odd");
		
		sc.close();
	}

}
