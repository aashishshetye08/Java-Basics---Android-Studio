package loop;

public class DoWhileLoop {

	public static void main(String[] args) {

		int sum = 0, n = 0;
		do {
			sum += n;
			System.out.print(sum + " ");
			n++;
		}while(n<=10);
	}

}
