package methodoverriding;

public class Car extends Vehicle{
	
	public void start () {									//Not important to have public class when accessing within a package
		System.out.println("Car has started");
	}
	
	public void accelerate(int accel) {
		this.accel = accel;
		System.out.println("Car is accelerated to "+accel+"kmph");
	}
	
	public void stop() {
		System.out.println("Car has stop.");
	}
}
