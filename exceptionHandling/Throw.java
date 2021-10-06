package exceptionHandling;

public class Throw {

	public static int divide(int x, int y) {
		if (y == 0) {
			throw new ArithmeticException("Divider shouldn't be equal to 0.");	//specifically used in methods
		}
		return x / y;
	}

	public static void main(String[] args) {

		try {
			int d = (int)divide(11,10);
			System.out.println("Result : "+d);
		}
		catch(ArithmeticException e) {				//handles the exception
			System.out.println(e);
		}
	}

}
