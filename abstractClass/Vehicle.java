package abstractClass;

public abstract class Vehicle {
/*
 * If a class has atleast one abstract method then the class should also be declared abstract.
 * Abstract class can only be extended
 * So, it cannot have any instance(object)
 * Abstract class does not need any body but it must have a return type, method name and parameters
 * Methods and members of an abstract class can be given any visibility such as public,protected,etc 
 */
	String type, model;
	
	//COnstructor
	public Vehicle (String type, String model) {
		this.type = type;
		this.model = model;
	}
	
	// non-abstract class
	public void start () {
		System.out.println("Vehicle has started");
	}
	
	// non-abstract class
	public void stop () {
		System.out.println("Vehicle has stopped");
	}
	
	//abstract class
	public abstract int getmaxspeed ();
	
	
}
