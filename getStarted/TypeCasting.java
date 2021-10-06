package getStarted;

public class TypeCasting {

	public static void main(String[] args) {

		int a = 10;
		long b = a;
		double c = b;
		
		System.out.println("int value : "+a);
		System.out.println("long value : "+b);
		System.out.println("double value : "+c+"\n");
		
		double m = 3.14;
		long n = (long) m;
		int o = (int) n;
		
		System.out.println("double value : "+m);
		System.out.println("long value : "+n);
		System.out.println("int value : "+o);
	}

}
