package abstractClass;

public class Car extends Vehicle{

	public Car(String type, String model) {
		super(type, model);
			
	}

	@Override
	public int getmaxspeed() {
		final int maxspeed = 320;
		System.out.println("Max speed of last ride : "+maxspeed);
		return maxspeed;
	}
	
	@Override
	public void start () {
		System.out.println("Vehicle has started");
	}
	
	@Override
	public void stop () {
		System.out.println("Vehicle has stopped");
	}
	
}
