package encapsulation;

public class Car extends Vehicle{

	private boolean isAutomatic = false;
	
	public Car(String model, int maxspeed, boolean isAutomatic) {
		super(model, maxspeed);
		this.isAutomatic = isAutomatic;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
		
}
