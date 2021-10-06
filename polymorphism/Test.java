package polymorphism;

public class Test {

	public static void main(String[] args) {

		Vehicle obj0 = new Car();
//		this works because Car is a subclass of Vehicle.
		obj0.accelerate();
		
		Vehicle obj1 = new Motorcycle();
		obj1.accelerate();
		
	}

}
