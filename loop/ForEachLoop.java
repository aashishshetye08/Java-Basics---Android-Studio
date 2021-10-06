package loop;

public class ForEachLoop {

	public static void main(String[] args) {

//		To traverse in an array or list
		
		char[] say = {'h','e','l','l','o'};
		for (int i=0; i<say.length; i++)		//Traditional way
			System.out.print(say[i]);
		
		System.out.println();
		
		for (char c : say)						//For Each
			System.out.print(c);
		
		System.out.println();
		
		int[] num = {-2,5,8,7,10};
		for(int n : num)
			System.out.print(n+",");
	}

}
