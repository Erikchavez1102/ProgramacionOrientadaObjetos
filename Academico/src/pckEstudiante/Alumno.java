package pckEstudiante;

import java.util.List;

import packPersona.Persona;
import pckMateria.Materia;

public class Alumno extends Persona{
	
	private String carrera;
	private String semestre;
	private List<Materia> lstMateria;
	
	
	public List<Materia> getLstMateria() {
		return lstMateria;
	}
	public void setLstMateria(List<Materia> lstMateria) {
		this.lstMateria = lstMateria;
	}
	//************* POLIMORFISMO****************************
	public Alumno(String carrera) {
		super();
		this.carrera = carrera;
	}
	public Alumno(String carrera, String semestre) {
		super();
		this.carrera = carrera;
		this.semestre = semestre;
	}
	public Alumno() {
		super();
	}
	//********************************************************
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		return "Alumno [carrera=" + carrera + ", semestre=" + semestre + ", lstMateria=" + lstMateria + ", getCedula()="
				+ getCedula() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getCorreoElectronico()=" + getCorreoElectronico() + ", getCelular()=" + getCelular()
				+ ", getDireccion()=" + getDireccion() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
