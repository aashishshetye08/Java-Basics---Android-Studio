package projects;

public class ExponentialNo {

	public static void main(String[] args) {

		int base=2, exp=10;
		for(int i=0; i<=10; i++) 
			System.out.println(base+" to the power "+exp+" : "+expo(base,i));
		
	}
	
	public static int expo(int base, int power) {
		return (int) Math.pow(base, power);
	}

}
