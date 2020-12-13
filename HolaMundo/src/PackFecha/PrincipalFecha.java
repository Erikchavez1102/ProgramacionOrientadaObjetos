package PackFecha;
public class PrincipalFecha {

	public static void main(String[] args) {
		
		Fecha objFecha = new Fecha();
		objFecha.setDia(12); 
		objFecha.setMes(12);;
		objFecha.setAño(2020);
		
		System.out.println("Dia: "+ objFecha.getDia()+ ", Mes: "+objFecha.getMes()+ ", Año: "+objFecha.getAño()  );
		System.out.println(objFecha.toString());

	}

}
