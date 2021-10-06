package encapsulation;

public class Test {

	public static void main(String[] args) {

		Car obj = new Car("Ford", 220, true);
		System.out.println("Model : "+obj.getModel());
		System.out.println("Max Speed : "+obj.getMaxspeed()+"kmph");
		System.out.println("isAutomatic : "+obj.isAutomatic());
		
	}

}
