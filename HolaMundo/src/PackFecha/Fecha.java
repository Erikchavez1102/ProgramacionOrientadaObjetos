package PackFecha;

public class Fecha {
	
	private int dia;
	private int mes;
	private int a�o;
	
	
	
	
	public int getDia() {
		return dia;
	}




	public void setDia(int dia) {
		this.dia = dia;
	}




	public int getMes() {
		return mes;
	}




	public void setMes(int mes) {
		this.mes = mes;
	}




	public int getA�o() {
		return a�o;
	}




	public void setA�o(int a�o) {
		this.a�o = a�o;
	}




	public void imprimir() {
		System.out.println("Dia: "+ dia + " Mes: "+ mes + " A�o: "+ a�o );
	}




	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
	}

	
}

