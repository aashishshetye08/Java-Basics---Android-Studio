package IiterfaceClass;

public class MotorCycle implements Drivable{

	@Override
	public void turnLeft() {
		System.out.println("MotorCycle can turn Left.");
	}

	@Override
	public void turnRight() {
		System.out.println("MotorCycle can turn Right.");
	}

	
	
}
