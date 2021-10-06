package getStarted;

import java.util.Scanner;

public class InputMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
															//can first initialize a variable and then print that variable or
		System.out.println("You Entered : "+sc.nextInt()+"\n");	//directly print the method 
		
		System.out.println("Enter String : ");
															//can first initialize a variable and then print that variable or
		System.out.println("You Entered : "+sc.next());		//directly print the method
		
	}

}
