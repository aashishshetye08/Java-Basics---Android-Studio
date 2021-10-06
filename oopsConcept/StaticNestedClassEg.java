package oopsConcept;

public class StaticNestedClassEg {

	int a = 5;
	static int b = 10;
	private static int c = 15;
	
	static class StaticNestedClass {
		void show () {
//			System.out.println("a : "+a);	//A normal variable cannot be accessed in static class
			System.out.println("b : "+b);
			System.out.println("c : "+c);
		}
	}
	
}
