package this_super_keyword;

public class Vehicle {
	
	String model, type;
	int maxspeed;
	
	public Vehicle (String type, String model, int maxspeed) {
		this.type= type;					//"this" is used to access variables and method within a class
		this.model = model;
		this.maxspeed = maxspeed;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public int getMaxspeed() {
		return maxspeed;
	}
	

}
