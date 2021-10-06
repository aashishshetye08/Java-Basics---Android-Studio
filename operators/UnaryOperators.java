package operators;

public class UnaryOperators {

	public static void main(String[] args) {

		int x=10;
		boolean check = true;
		
		System.out.println("+x : "+ +x);				//Unary plus operator
		System.out.println("-x : "+ -x);				//Unary plus operator
		System.out.println("++x : "+ ++x);				//increment
		System.out.println("--x : "+ --x);				//decrement
		System.out.println("!check : "+ !check + "\n");	//Logical COmplement Operator
		
		int y = 25;
		System.out.println("y++ : "+ y++);
		System.out.println("y : "+ y);
		System.out.println("++y : "+ ++y);
		System.out.println("y : "+ y);
	}

}
