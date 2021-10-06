package stringClass;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Java Programming";
		int len = str.length();
		String revstr = "";
		
		for (int i = len - 1; i>=0; i--) {
			revstr += str.charAt(i); 
		}
		
		System.out.println(revstr);
		
	}

}
