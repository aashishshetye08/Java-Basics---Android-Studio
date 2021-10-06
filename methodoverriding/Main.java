package methodoverriding;

public class Main {

	public static void main(String[] args) {
		
		//Creating object for vehicle
		Vehicle obj = new Vehicle();
		obj.start();
		obj.accelerate(20);
		obj.stop();
		
		System.out.println("\n");
		
		//Creating object for Car
		Car obj1 = new Car();
		obj1.start();
		obj1.accelerate(50);
		obj1.stop();
	}

}
