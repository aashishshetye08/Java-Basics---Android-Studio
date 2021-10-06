package stringClass;

public class ImmutableString {

	public static void main(String[] args) {

		String s = "Hello";
		s.concat(", Welcome to Java");
		
		//when s.concat is executed, it refers to different instance and hence s ie string is immutable
		 
		System.out.println(s);
		System.out.println(s.concat(", Welcome to Java"));
		
	}

}
