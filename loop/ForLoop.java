package loop;

public class ForLoop {

	public static void main(String[] args) {

		for(int i = 0; i<=10; i++) 
			System.out.print(i+" ");
		
		int sum=0;
		for(int i=0; i<=10; i++) 
			sum += i;
		System.out.println("\n\nSum of nos: "+sum);
		
		sum=0;
		for(int i=0; i<=10; i+=2) 
			sum += i;
		System.out.println("\nSum of nos: "+sum);
		
		
		
		
	}

}
