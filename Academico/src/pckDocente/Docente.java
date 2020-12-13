package pckDocente;

import packPersona.Persona;

public class Docente extends Persona{
	
	
	private int aniosServicio;
	private String tipoContrato;
	
	public int getAniosServicio() {
		return aniosServicio;
	}
	public void setAniosServicio(int aniosServicio) {
		this.aniosServicio = aniosServicio;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	@Override
	public String toString() {
		return "Docente [aniosServicio=" + aniosServicio + ", tipoContrato=" + tipoContrato + ", getCedula()="
				+ getCedula() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getCorreoElectronico()=" + getCorreoElectronico() + ", getCelular()=" + getCelular()
				+ ", getDireccion()=" + getDireccion() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
