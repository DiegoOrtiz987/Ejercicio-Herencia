package util;

import Modelo.Alumno;
import Modelo.Anio;
import Modelo.Curso;

public class DataBase {
	
	private Alumno [] alumnos = new Alumno[5];
	private Curso ekis=null;
	private Anio este=null;
	
	public DataBase(){
		
		ekis= new Curso();
		este= new Anio();
		
		ekis.setNombre("Codo a Codo");
		este.setFecha("06-07-2017");	
		
		
		Alumno Axell = new Alumno();
		Axell.setNombre("Axell");
		Axell.setEdad(25);
		Axell.setCurso(ekis);
		Axell.setAnio(este);
		Axell.setMatricula(12345);
		alumnos[0]=Axell;
		
		Alumno Joseph = new Alumno();
		Joseph.setNombre("Joseph");
		Joseph.setEdad(45);
		Joseph.setCurso(ekis);
		Joseph.setAnio(este);
		Joseph.setMatricula(5432);
		alumnos[1]=Joseph;
		
		Alumno Tatiana = new Alumno();
		Tatiana.setNombre("Tatiana");
		Tatiana.setEdad(31);
		Tatiana.setCurso(ekis);
		Tatiana.setAnio(este);
		Tatiana.setMatricula(3456);
		alumnos[2]=Tatiana;
		
		Alumno Agustin = new Alumno();
		Agustin.setNombre("Agustin");
		Agustin.setEdad(27);
		Agustin.setCurso(ekis);
		Agustin.setAnio(este);
		Agustin.setMatricula(8765);
		alumnos[3]=Agustin;
		
		Alumno Alexis = new Alumno();
		Alexis.setNombre("Alexis");
		Alexis.setEdad(39);
		Alexis.setCurso(ekis);
		Alexis.setAnio(este);
		Alexis.setMatricula(2398);	
		alumnos[4]=Alexis;
		
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}
	
}
	