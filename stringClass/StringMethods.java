package stringClass;

public class StringMethods {

	public static void main(String[] args) {

		String s0 = "Java Programming Home";
		String s1 = " ";
		
		System.out.println("String : " + s0);
		System.out.println("The First letter : "+s0.charAt(0));
		System.out.println("Length : "+s0.length());
		System.out.println("Substring : "+s0.substring(5));
		System.out.println("is equal : "+s0.equals(s1));
		System.out.println("is empty : "+s0.isEmpty());
		System.out.println("Concat : "+s0.concat(s1));
		System.out.println("Uppercase : "+s0.toUpperCase());
		System.out.println("Lowercase : "+s0.toLowerCase());
		
		// split() method
		String s3[] = s0.split(s1);		//s0.split(regex)	where, regex means any character or string form where the given string must be
										//splitted. For eg: (" ") - this will split the given string whenever a spce appears.
		for (String s: s3) 
			System.out.println(s);
		
		// replace() method
		System.out.println("Replace a with A: "+s0.replace('a', 'A'));
	}

}
