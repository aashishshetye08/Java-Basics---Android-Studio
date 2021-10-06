package operators;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 5, b = 8, c = 10;
		boolean result;
		
		result = (a>b) && (c>b);				//AND Operator
		System.out.println("Result : "+result);
		
		result = (a>b) || (c>b);				//OR Operator
		System.out.println("Result : "+result);
		
		result = a<b ? true : false;			//Shorthand for if else statement
		System.out.println("Result : "+result);
		
		
	}

}
