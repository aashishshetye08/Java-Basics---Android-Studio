package encapsulation;

public class Vehicle {

	private String model;
	private int maxspeed;
	
	public Vehicle(String model, int maxspeed) {
		this.model = model;
		this.maxspeed = maxspeed;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
