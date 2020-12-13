package pckTestAcademico;

import java.util.ArrayList;
import java.util.Scanner;

import pckDocente.Docente;
import pckEstudiante.Alumno;
import pckMateria.Materia;

public class TestAcademico {

	public static void main(String[] args) {

		Alumno objAlumno1 = new Alumno();
		objAlumno1.setCarrera("SISTEMAS");
		objAlumno1.setSemestre("5");
		objAlumno1.setApellido("CHAVEZ");
		objAlumno1.setNombre("ERIK");
		objAlumno1.setLstMateria(new ArrayList<Materia>());
		objAlumno1.getLstMateria().add(new Materia());
		objAlumno1.getLstMateria().add(new Materia());
		objAlumno1.getLstMateria().add(new Materia());
		objAlumno1.getLstMateria().add(new Materia());
		
		System.out.println(objAlumno1);
		System.out.println("NUMERO DE MATERIAS: " + objAlumno1.getLstMateria().size());
		

		Docente objDocente1 = new Docente();
		objDocente1.setTipoContrato("PERMANENTE");
		objDocente1.setAniosServicio(5);

		Materia objMateria1 = new Materia();
		objMateria1.setNombreMateria("PROGRAMACION");
		objMateria1.setSemestre("PRIMER SEMESTRE");
		objMateria1.setNumeroCreditos(30);
		objMateria1.setNota1((float) 4.0);
		objMateria1.setNota2((float) 3.1);
		objMateria1.setNotaSupletorio((float) 4.8);
		Docente objDocente2 = new Docente();
		objMateria1.setDocente(objDocente2);
		objMateria1.setDocente(new Docente ());
		objMateria1.getDocente().setNombre("PEPITO");
		System.out.println("Nombre materia: "+ objMateria1.getNombreMateria());
		
		
		
		
	}
	

}
