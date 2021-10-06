package methods;

import java.util.Scanner;

public class methodCalling {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter two nos: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		display(n1,n2);
		System.out.println("Sum : "+ add(n1,n2));
		System.out.println("Max : "+ max(n1,n2));
	}
	
	public static void display(int n1, int n2) {
		System.out.println("You Entered : "+n1+" "+n2);
	}
	
	public static int add(int n1, int n2) {
		return (n1+n2);
	}

	public static int max(int n1, int n2) {
		if (n1>n2)
			return n1;
		else
			return n2;
	}

}
