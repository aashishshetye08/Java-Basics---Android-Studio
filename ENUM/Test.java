package ENUM;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner inn = new Scanner(System.in);
		System.out.println("Enter a Color : ");
		String colour = inn.next();
		try {
			
			Color color = Color.valueOf(colour.toUpperCase());
			switch (color) {									//use object here
				case RED:
					System.out.println("You Entered RED");
					break;
				case GREEN:
					System.out.println("You Entered RED");
					break;
				case YELLOW:
					System.out.println("You Entered RED");
					break;
//				default: 											//no meaning of default bcz an object is placed in switch(__) 
//					System.out.println("Invalid Colour selected");
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("*Enter valid Colour such as : [RED, GREEN, YELLOW]");
		}

	}

}
