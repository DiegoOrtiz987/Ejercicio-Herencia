package controlador;

import Modelo.Alumno;
import util.DataBase;

public class Logica implements Operaciones{
	
	DataBase db=null;
	Alumno [] todos;
	Alumno encontrado=null;
	
	public Logica (){
		
		db= new DataBase();
		todos = db.getAlumnos();
	}
	
	

	@Override
	public Alumno buscarPor(String nombre) {
		
		for (int i = 0; i < todos.length; i++) {
			
			if (nombre.equalsIgnoreCase(todos[i].getNombre())){
				
				encontrado=todos[i];
			}
			
		}
		
		return encontrado;
	}

	@Override
	public Alumno buscarPor(int mat) {
		
		for (int i = 0; i < todos.length; i++) {
					
					if (mat==(todos[i].getMatricula())){
						
						encontrado=todos[i];
					}
					
				}
		
		return encontrado;
	}

}
