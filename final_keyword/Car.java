package final_keyword;

public class Car extends Vehicle{					//final class cannot be extended

	public void maxspeed () {
		System.out.println("Max SPeed is 360 kmph");	//final methods cannot be overridden
	}
	
}
