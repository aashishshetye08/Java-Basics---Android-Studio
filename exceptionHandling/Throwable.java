package exceptionHandling;

public class Throwable {

	public static double divide (double x, double y) {
		
		if(y == 0) {
			throw new ArithmeticException("ArithmeticException occured"); 
		}
		return x/y;
	}
	
	public static void main(String[] args) {

		double d;
		try {
			d = divide(5,0);
			System.out.println("Result: "+d);
		}
		catch(ArithmeticException e) {
//			System.out.println("Divider cannot be 0");
//			System.out.println(e.getMessage());			//prints the string written in throw statement
//			System.out.println(e.toString());			//prints the string written in throw statement and some more detail about it
//			e.printStackTrace();						//Full detail about the exception
		}
		
	}

}
