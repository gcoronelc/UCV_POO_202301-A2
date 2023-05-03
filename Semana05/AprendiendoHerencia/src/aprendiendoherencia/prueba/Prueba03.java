package aprendiendoherencia.prueba;

import aprendiendoherencia.service.Clase3;
import aprendiendoherencia.service.VentaService;
import aprendiendoherencia.service.VentaServiceOne;
import aprendiendoherencia.service.VentaServiceTwo;

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
		VentaService service1 = new VentaServiceOne();
		VentaService service2 = new VentaServiceTwo();
		System.out.println("Venta 1: " + service1.calcImporte(48.65, 8));		
		System.out.println("Venta 2: " + service2.calcImporte(48.65, 8));		
	}

}
