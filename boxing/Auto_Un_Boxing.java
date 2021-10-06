package boxing;

public class Auto_Un_Boxing {

	public static void main(String[] args) {

		Double db = 3.14; 	//AutoBoxing- primitive to wrapper class
		double d = db;		//UnBoxing - wrapper class to primitive
		System.out.println(db + " " + d);
		
		Integer in = 8;		//AutoBoxing- primitive to wrapper class
		int n = in;			//UnBoxing - wrapper class to primitive
		System.out.println(in + " " + n);
		
		Character ch = 'a';	//AutoBoxing- primitive to wrapper class
		char c = ch;		//UnBoxing - wrapper class to primitive
		System.out.println(ch + " " +c);
		
	}

}
