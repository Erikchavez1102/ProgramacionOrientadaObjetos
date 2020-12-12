
public class Principal {

	public static void main(String[] args) {
		Persona objPersona;
		objPersona = new Persona();
		
		Persona objPersona2;
		objPersona2 = new Persona ();
		
		Persona ObjPersona3 = new Persona();
		
		objPersona.cedula="123446879";
		objPersona.estaturaMetros=1.50;
		objPersona.nombre = "Pepito Perez";
		
		
		objPersona2.cedula="ASD-348679569";
		objPersona2.estaturaMetros=1.77;
		objPersona2.nombre = "Juan A. Sol";
		
		ObjPersona3.cedula="CE-3456";
		ObjPersona3.estaturaMetros=1.27;
		ObjPersona3.nombre = "Hret Kleu";
		
		
		System.out.println("El nombre es: " +objPersona.nombre+ ", Cedula: "+ objPersona.cedula + ", Altura: "+	objPersona.estaturaMetros);
		System.out.println("El nombre es: " +objPersona2.nombre+ ", Cedula: "+ objPersona2.cedula + ", Altura: "+	objPersona2.estaturaMetros);
		System.out.println("El nombre es: " +ObjPersona3.nombre+ ", Cedula: "+ ObjPersona3.cedula + ", Altura: "+	ObjPersona3.estaturaMetros);

		
		
		
		
	}

}
