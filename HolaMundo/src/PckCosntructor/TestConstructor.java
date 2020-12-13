package PckCosntructor;

public class TestConstructor {

	public static void main(String[] args) {
		
		Cosntructor objConstructor = new Cosntructor("Andres","Cardenas");
		Cosntructor objConstructor1 = new Cosntructor("Andres");
		Cosntructor objConstructor2 = new Cosntructor();

		
		System.out.println(objConstructor);
		System.out.println(objConstructor1);
		System.out.println(objConstructor2);

	}

}
