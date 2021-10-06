package controlFlowStatements;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter day no: ");
		int a = sc.nextInt();
		String day;
		
		switch (a) {
			case 1 :
				day = "Monday";
				break;
			case 2 :
				day = "Tuesday";
				break;
			case 3 :
				day = "Wednesday";
				break;
			case 4 :
				day = "Thursday";
				break;
			case 5 :
				day = "Friday";
				break;
			case 6 :
				day = "Saturday";
				break;
			case 7 :
				day = "MSunday";
				break;
			default :
				day = "Invaild";
				break;
		}
		System.out.println("Day : "+day);
		sc.close();
		
	}

}
