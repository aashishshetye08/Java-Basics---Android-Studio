package stringClass;

public class StringBuilderEg {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("Hello");
		s.append(", Welcome to Java");	
//			Since its a mutable string
//			's' object points to Hello, Welcome to Java
//			only diff between buffer and builder is buffer is synchronized ie thread safe and its performance is slow as compared to builder.
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.insert(s.length(), ". This is Aashish Shetye"));
		System.out.println(s.reverse());
		System.out.println(s.reverse());
		System.out.println(s.delete(0, 10));
	}

}
