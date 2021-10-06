package oopsConcept;

public class InnerClassTest {

	public static void main(String[] args) {

		InnerClassEg outer = new InnerClassEg();
		InnerClassEg.InnerClass inner = outer.new InnerClass();
		inner.show();
		
	}

}
