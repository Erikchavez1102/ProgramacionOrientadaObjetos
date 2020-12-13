package PackAuto;
public class PrincipalAuto {

	public static void main(String[] args) {
		
		Auto objAuto1 = new Auto ();
		Auto objAuto2 = new Auto ();
		Auto objAuto3 = new Auto ();
		
		objAuto1.marca = "BMW";
		objAuto1.anio = 2019;
		objAuto1.precio= 30000;
		
		objAuto2.marca = "Ferrari";
		objAuto2.anio = 2020;
		objAuto2.precio= 45000;
		
		objAuto3.marca = "Mercedes";
		objAuto3.anio = 2019;
		objAuto3.precio= 70000;
		
		
		System.out.println("Auto1: "+objAuto1.marca+", Año: " + objAuto1.anio +", Precio Dolares: "+ objAuto1.precio);
		System.out.println("Auto2: "+objAuto2.marca+", Año: " + objAuto2.anio +", Precio Dolares: "+ objAuto2.precio);
		System.out.println("Auto3: "+objAuto3.marca+", Año: " + objAuto3.anio +", Precio Dolares: "+ objAuto3.precio);


	}

}
