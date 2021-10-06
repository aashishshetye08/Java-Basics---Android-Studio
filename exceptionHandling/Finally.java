package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		int n1, n2, res=0;					
		boolean flag=true;
		
		Scanner sc = new Scanner(System.in);
		while(flag) {
			try {
				
				System.out.print("\nEnter num1 : ");
				n1= sc.nextInt();
				System.out.print("\nEnter num2 : ");
				n2= sc.nextInt();
				res = n1/n2;
				flag=false;
				sc.close();
			}
			catch(InputMismatchException e) {					//as its a string, so sc.next() is imp for nxt input.
				System.out.println("Enter valid input.");
				flag = true;
				sc.next();							
			}
			catch(ArithmeticException e) {						//this evokes only for int long n not for float n double
				System.out.println("2nd number cannot be 0.");
				flag=true;
			}
			catch(Exception e) {
				System.out.println("An Exception Occured.");
				flag=true;
			}
			finally {
				if(flag) {
					System.out.println("\nException Found.");
				}
				else {
					System.out.println("\nResult : "+res);
					System.out.println("\nRun Successfully.");
				}
			}
		}
		
		
		
		
		
	}

}
