package methods;

import java.util.Scanner;

public class methodOverloading {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("add with two int parameters : " + add(45,55));
		System.out.println("add with three int parameters : " + add(25,47,54));
		System.out.println("add with two double parameters : " + add(45.2,55.7));
		
	}
	
	public static int add(int n1, int n2) {
		int sum = n1 + n2; 
		return sum;
	}
	
	public static int add(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		return sum;
	}
	
	public static double add(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}

}
