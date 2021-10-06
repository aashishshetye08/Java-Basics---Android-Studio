package oopsConcept;

public class ConstructorMain {

	public static void main(String[] args) {

		Constructor obj0 = new Constructor("Ferrari");
		obj0.start();
		obj0.accelerate();
		obj0.show();
		obj0.stop();
		obj0.show();
		
		Constructor obj1 = new Constructor("Ferrari", "Red", 2015);
		obj1.moreDetails();
		
	}

}
