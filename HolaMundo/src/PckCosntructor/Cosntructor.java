package PckCosntructor;

public class Cosntructor {
	
	private String nombre;
	private String apelido;
	
	
	
	public Cosntructor(String nombre, String apelido) {
		super();
		this.nombre = nombre;
		this.apelido = apelido;
	}
	
	
	public Cosntructor(String nombre) {
		super();
		this.nombre = nombre;
	}
	


	public Cosntructor() {
		super();
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	@Override
	public String toString() {
		return "Cosntructor [nombre=" + nombre + ", apelido=" + apelido + "]";
	}
	

}
