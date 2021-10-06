package oopsConcept;

public class StaticKeyword {

	static int currentspeed = 0;
	static int maxspeed = 200;
	
	static void showspeed (int speed) {
		System.out.println("Your speed is: "+speed);
	}
	
	static void speedup (int inc) {
		currentspeed += inc;
		if (currentspeed > maxspeed) 
			System.out.println("Slow Down");
		else
			showspeed(currentspeed);				//Can used a method in another method 
	}
	
	static void speedown (int dec) {
		currentspeed -= dec;
		showspeed(currentspeed);
	}
	
	static void stop () {
		currentspeed=0;
		showspeed(currentspeed);
	}
		
	
	
}
