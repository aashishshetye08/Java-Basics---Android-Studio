package oopsConcept;

public class StaticKeywordTest {

	public static void main(String[] args) {

		StaticKeyword.speedup(100);				//No object required bcz its a static method
		StaticKeyword.speedup(150);
		StaticKeyword.speedown(70);
		StaticKeyword.stop();
		
		StaticKeyword obj = new StaticKeyword();
		obj.speedup(100); 						//Makes another data set
		
	}

}
