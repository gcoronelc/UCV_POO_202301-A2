package apendiendojava.prueba;

import apendiendojava.service.Clase1;
import apendiendojava.service.Clase2;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		
		final String NOMBRE = "Gustavo Coronel";

		Clase1 clase1 = new Clase2();
		System.out.println("Suma: " + clase1.sumar(8, 5));
		
	}

}
