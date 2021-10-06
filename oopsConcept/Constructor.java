package oopsConcept;

public class Constructor {

	private String model;
	private int carspeed = 0;
	private String color;
	private int year;

//		Class & Constructor must be a noun
	public Constructor(String model) {
		this.model = model;
	}

	public Constructor(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}

//		method must be a verb
	public void start() {
		System.out.println(this.model + " has started");
	}

	public void accelerate() {
		this.carspeed += 20;
	}

	public void stop() {
		this.carspeed = 0;
		System.out.println(this.model + " has stopped");
	}

	public void show() {
		System.out.println("Your speed is " + this.carspeed + "kmph \n");
	}

	public void moreDetails() {
//			in plcae of void, string can be written and so in return statemnt a string can be written and then in main, method is called in sysout
		System.out.println("Model: " + this.model + "\t Colour: " + this.color + "\t Established: " + this.year);
	}

}
