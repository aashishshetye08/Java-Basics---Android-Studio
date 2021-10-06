package stringClass;

public class StringEg {

	public static void main(String[] args) {

//		By literals method:
		String s0 = "Hello World";
		String s1 = "Hello World";
		
//		By creating object
		String sobj0 = new String("Hello World");
		String sobj1 = new String("Hello World");
		
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(sobj0);
		System.out.println(sobj1);
		
		/*
		 * '==' method is used to check equality between references
		 * equal() method is used to check equality between strings
		 */
		
		System.out.println("s0 == s1 : " + (s0 == s1));
		System.out.println("s0 == sobj0 : " + (s0 == sobj0));
		System.out.println("sobj0 == sobj1 : " + (sobj0 == sobj1));
		System.out.println("s0.equals(s1) : " + (s0.equals(s1)));
		System.out.println("s0.equals(sobj1) : " + (s0.equals(sobj1)));
		System.out.println("sobj0.equals(sobj1) : " + (sobj0.equals(sobj1)));

	}

}
