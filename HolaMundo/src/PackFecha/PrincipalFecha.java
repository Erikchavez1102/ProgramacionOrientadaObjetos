package PackFecha;
public class PrincipalFecha {

	public static void main(String[] args) {
		
		Fecha objFecha = new Fecha();
		objFecha.setDia(12); 
		objFecha.setMes(12);;
		objFecha.setA�o(2020);
		
		System.out.println("Dia: "+ objFecha.getDia()+ ", Mes: "+objFecha.getMes()+ ", A�o: "+objFecha.getA�o()  );
		System.out.println(objFecha.toString());

	}

}
