package stringClass;

public class StringBufferEg {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Hello");
		s.append(", Welcome to Java");	//Since its a mutable string
			//'s' object points to Hello, Welcome to Java
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.insert(s.length(), ". This is Aashish Shetye"));
		System.out.println(s.reverse());
		System.out.println(s.reverse());
		System.out.println(s.delete(0, 10));
		
	}

}
