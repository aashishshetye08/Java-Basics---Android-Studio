package IiterfaceClass;

public class Car implements Drivable{

	@Override
	public void turnLeft() {
		System.out.println("Car can turn Left.");
	}

	@Override
	public void turnRight() {
		System.out.println("Car can turn Right.");
	}

}
