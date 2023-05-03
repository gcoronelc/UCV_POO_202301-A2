package aprendiendoherencia.prueba;

import aprendiendoherencia.service.Clase3;

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
		Clase3 bean = new Clase3();
		System.out.println("Hola, estoy en Prueba02.");
		System.out.println("9 + 7 = " + bean.sumar(9, 7));
		System.out.println("EL MEJOR: " + bean.EL_MEJOR);
	}

}
