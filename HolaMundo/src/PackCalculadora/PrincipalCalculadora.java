package PackCalculadora;
public class PrincipalCalculadora {

	public static void main(String[] args) {
		
		int resultado = 0;
		Calculadora objCalculadora = new Calculadora ();
		resultado = objCalculadora.sumar(8, 5);
		
		System.out.println("Resultado = " + resultado);
		

	}

}
