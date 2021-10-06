package oopsConcept;

public class InnerClassEg {

	int a = 5;
	static int b = 10;
	private static int c = 15;

	class InnerClass {
		void show() {
			System.out.println("a : " + a); 
			System.out.println("b : " + b);	// A static variable can be accessed in normal class
			System.out.println("c : " + c);	// A static variable can be accessed in normal class
		}
	}

}
