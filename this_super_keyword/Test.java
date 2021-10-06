package this_super_keyword;

public class Test {

	public static void main(String[] args) {

		Car obj = new Car("Car", "Ford", 180, true);
		
		System.out.println("Type : "+obj.type);
		System.out.println("Model : "+obj.model);
		System.out.println("Max Speed : "+obj.maxspeed+"Kmph");
		System.out.println("Is AUtomatic? : "+obj.isAutomatic);
	}

}
