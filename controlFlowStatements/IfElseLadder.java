package controlFlowStatements;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		/*
		System.out.print("Enter your age : ");
		byte age = sc.nextByte();
		
		if (age <=12)
			System.out.println("You are a child");
		else if (age <=18)
			System.out.println("You are a teenager");
		else {
			if (age <= 60)
				System.out.println("You are a adult");
			else
				System.out.println("You are a senior");
		}*/
		
		System.out.print("Enter 3 nos: ");
		int large=0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a >= b) {
			if (a >= c)
				large = a;
			else
				large = c;
		}else {
			if (b >= c)
				large = b;
			else
				large = c;
		}
		
		System.out.println("Largest among 3: "+large);
		sc.close();
	}

}
