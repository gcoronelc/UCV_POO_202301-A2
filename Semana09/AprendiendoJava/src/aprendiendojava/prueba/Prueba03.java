package aprendiendojava.prueba;

import aprendiendojava.service.MateService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		MateService service = new MateService();
		System.out.println("Promedio 1: " + service.promedio(15.0, 16, 18));
	}

}
