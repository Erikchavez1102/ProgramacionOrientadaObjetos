
public class PrincipalRectangulo {

	public static void main(String[] args) {

		int resultadoArea = 0;
		int resultadoPerimetro = 0;
		
		Rectangulo objArea = new Rectangulo();
		resultadoArea = objArea.area(10, 5);
		System.out.println("Area = " + resultadoArea);
		
		Rectangulo ObjPerimetro = new Rectangulo ();
		resultadoPerimetro = ObjPerimetro.perimetro(10, 5);
		System.out.println("Perimetro = " + resultadoPerimetro);

	}

}

