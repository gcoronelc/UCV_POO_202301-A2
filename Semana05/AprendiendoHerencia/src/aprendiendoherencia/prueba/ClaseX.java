package aprendiendoherencia.prueba;

import aprendiendoherencia.service.Clase1;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class ClaseX extends Clase1{
	
	private void mostrar(){
		System.out.println("Hola " + this.getNombre());
	}

	
	public static void main(String[] args) {
		ClaseX o = new ClaseX();
		o.mostrar();
	}
	
}
