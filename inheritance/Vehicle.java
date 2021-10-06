package inheritance;

public class Vehicle {

	String model, type;
	int maxspeed;
	
	void printdetails () {
		System.out.println("Type : "+type);
		System.out.println("Model : "+model);
		System.out.println("MaxSpeed : "+maxspeed+"kmph");
	}
	
}
