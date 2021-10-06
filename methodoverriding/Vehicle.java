package methodoverriding;

public class Vehicle {

	int accel=0;
	
	public void start () {									//Not important to have public class when accessing within a package
		System.out.println("Vehicle has started");
	}
	
	public void accelerate(int accel) {
		this.accel = accel;
		System.out.println("Vehicle is accelerated to "+accel+"kmph");
	}
	
	public void stop() {
		System.out.println("Vehicle has stop.");
	}
	
}
