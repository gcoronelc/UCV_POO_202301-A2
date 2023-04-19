package pe.edu.ucv.sistventas.prueba;

import pe.edu.ucv.sistventas.model.VentaItem;
import pe.edu.ucv.sistventas.model.Ventas;
import pe.edu.ucv.sistventas.service.VentaService;

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
		
		// Servicio
		VentaService service = new VentaService();
		
		// Agregar una venta 1
		VentaItem item1 = new VentaItem("Abc", 10, 5, 50);
		service.registrarVenta(item1);
		
		// Agregar una venta 2
		VentaItem item2 = new VentaItem("Xyz", 80, 5, 400);
		service.registrarVenta(item2);
		
		System.out.println("Cantidad total: " + service.getCantidadTotal());
		System.out.println("Importe total: " + service.getImporteTotal());
		System.out.println(service.getItems());
	}

}
