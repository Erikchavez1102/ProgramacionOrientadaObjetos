package pckMateria;

import pckDocente.Docente;

public class Materia {
	
	private String nombreMateria;
	private String semestre;
	private int numeroCreditos;
	private float nota1;
	private float nota2;
	private float notaSupletorio;
	private Docente docente;
	
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public int getNumeroCreditos() {
		return numeroCreditos;
	}
	public void setNumeroCreditos(int numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getNotaSupletorio() {
		return notaSupletorio;
	}
	public void setNotaSupletorio(float notaSupletorio) {
		this.notaSupletorio = notaSupletorio;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
	
	
	

}
