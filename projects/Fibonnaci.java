package projects;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {

		int fib = 0, a=0,b=1, temp=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Limit: ");
		int limit = sc.nextInt();
		
		for(int i=1; i<=limit; i++) {
			System.out.print(a+" ");
			fib = a + b;
			a = b;
			b=fib;
		}
		
	}

}
