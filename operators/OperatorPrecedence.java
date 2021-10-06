package operators;

public class OperatorPrecedence {

	public static void main(String[] args) {

		int result = 0;
		
		result = 5 + 2 * 4;
		System.out.println("Result : "+result);
		
		result = (5 + 2) * 4;
		System.out.println("Result : "+result);
		
		int x=8, y=5, z=10, sum=0;
		sum = x + --y + --z;
		System.out.println("Sum : "+sum);
		
	}

}
