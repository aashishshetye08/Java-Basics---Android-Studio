package exceptionHandling;

public class Throws {

	public static void divide() throws ArithmeticException, NumberFormatException {	//writing separate method for exceptions
		int a = Integer.parseInt("8");
		int b = Integer.parseInt("8");
		int c = a/b;
		System.out.println("Result : "+c);
	}
	
	public static void main(String[] args) {

		try {
			divide();
		}
		catch(ArithmeticException e) {
			System.out.println("Second no shouldn't be 0");
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Number Format");
		}
		
	}

}
