package Modelo;

public class Alumno extends Persona {
	
	public int matricula;
	public Anio anio;
	public Curso curso;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Anio getAnio() {
		return anio;
	}
	public void setAnio(Anio anio) {
		this.anio = anio;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
