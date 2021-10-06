package this_super_keyword;

public class Car extends Vehicle{

	boolean isAutomatic = false;
	
	public Car(String type, String model, int maxspeed, boolean isAutomatic) {
		super(type, model, maxspeed);					//"super" is used to access variables and method of other class
		this.isAutomatic = isAutomatic;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

}
