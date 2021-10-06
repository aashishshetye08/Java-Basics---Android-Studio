package inheritance;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		car.type = "Car";
		car.model = "TATA";
		car.maxspeed = 200;
		car.printdetails();
		
		System.out.println("\n");
		
		Motorcycle bike = new Motorcycle();
		bike.type = "Yamaha";
		bike.model = "YK500";
		bike.maxspeed = 180;
		bike.printdetails();
				
		
	}

}
