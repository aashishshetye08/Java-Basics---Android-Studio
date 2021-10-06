package operators;

public class AssignmentOperator {

	public static void main(String[] args) {

		int x=20, y=15, z=0;
		
		z = x + y;							//SImple Assignment Operator
		System.out.println("Res1 : "+z);
		
		z += x ;							//ADD and Assignment Operator
		System.out.println("Res2 : "+z);
		
		z -= x ;							//SUB and Assignment Operator
		System.out.println("Res3 : "+z);
			
		z *= x ;							//Multiply and Assignment Operator
		System.out.println("Res4 : "+z);
		
		z /= x ;							//DIV and Assignment Operator
		System.out.println("Res5 : "+z);
		
		z %= x ;							//Modulus and Assignment Operator
		System.out.println("Res6 : "+z);
		
	}

}
