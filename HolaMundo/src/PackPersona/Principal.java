package PackPersona;
public class Principal {

	public static void main(String[] args) {
		Persona objPersona;
		objPersona = new Persona();
		
		Persona objPersona2;
		objPersona2 = new Persona ();
		
		Persona ObjPersona3 = new Persona();
		
		objPersona.setCedula("123446879");
		objPersona.setEstaturaMetros(1.50);
		objPersona.setNombre("Pepito Perez");
		
		
		objPersona2.setCedula("ASD-348679569");
		objPersona2.setEstaturaMetros(1.27);
		objPersona2.setNombre("Juan A. Sol");
		
		ObjPersona3.setCedula("CE-3456");
		ObjPersona3.setEstaturaMetros(1.38);
		ObjPersona3.setNombre("Hret Kleu");
		
		
		System.out.println("El nombre es: " +objPersona.getNombre()+ ", Cedula: "+ objPersona.getCedula() + ", Altura: "+	objPersona.getEstaturaMetros());
		System.out.println("El nombre es: " +objPersona2.getNombre()+ ", Cedula: "+ objPersona2.getCedula() + ", Altura: "+	objPersona2.getEstaturaMetros());
		System.out.println("El nombre es: " +ObjPersona3.getNombre()+ ", Cedula: "+ ObjPersona3.getCedula() + ", Altura: "+	ObjPersona3.getEstaturaMetros());
		System.out.println("======================================================");
		System.out.println(objPersona.toString());
		
		
		
	}

}
