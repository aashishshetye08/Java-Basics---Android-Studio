package loop;

public class WhileLoop {

	public static void main(String[] args) {

		int fact=1, n=1;
		
		while(n<=7) {
			fact *= n;
			System.out.println(n + "! = " + fact);
			n++;
		}
		
		/*while(true) {
			//infinite loop
		}*/
		
		byte a = 100;
		while(a==100) {
			//infinite loop
		}
		
	}

}
