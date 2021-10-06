package project_TrafficLight;

public class Test {

	public static void main(String[] args) {

		TrafficLight[] lights = TrafficLight.values();		//It's like declaring a variable light for variable type TrafficLight 

		for (TrafficLight light : lights) {
			System.out.println("COlour: " + light.name() + "\tAction: " + light.getAction());
		}

	}

}
