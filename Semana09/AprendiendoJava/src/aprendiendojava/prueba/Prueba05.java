package aprendiendojava.prueba;

import aprendiendojava.service.Empleado;
import aprendiendojava.service.MateService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba05 {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		
		System.out.println("Nombre: " + empleado.getNombre());
		System.out.println("Sueldo: " + empleado.getSueldo());
		System.out.println("Edad: " + empleado.getEdad());
	
	}

}
