import Modelo.Alumno;
import controlador.Logica;
import vista.Pantalla;

public class Aplication {

	public static void main(String[] args) {
		
		Pantalla vista = new Pantalla();
		Logica controlador = new Logica();
		String valor=vista.ingresarValor("Ingrese el nombre a consultar");
		Alumno logan = controlador.buscarPor(valor);
		
		vista.mostrarMensaje(logan.getNombre());
		
		
		
	}
	
}
