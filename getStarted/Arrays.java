package getStarted;

public class Arrays {

	public static void main(String[] args) {

		int dice [] = new int [6];
		dice[0] = 1;
		dice[1] = 2;
		dice[2] = 3;
		dice[3] = 4;
		dice[4] = 5;
		dice[5] = 6;
		 
		System.out.println("SUm : "+(dice[0]+dice[1]+dice[2]+dice[3]+dice[4]+dice[5]));
		
		int num [] = {4,2,-6,-9};
		System.out.println("\n Sum before manipulation : "+ (num[0]+num[1]+num[2]+num[3]));
		num[1] = 10;
		System.out.println("\n Sum after manipulation : "+ (num[0]+num[1]+num[2]+num[3]));
	}

}
