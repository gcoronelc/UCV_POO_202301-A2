package pe.edu.ucv.sistventas.prueba;

import pe.edu.ucv.sistventas.model.VentaItem;
import pe.edu.ucv.sistventas.model.Ventas;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		
		// Objeto ventas
		Ventas ventas = new Ventas();
		
		// Agregar una venta 1
		VentaItem item1 = new VentaItem("Abc", 10, 5, 50);
		ventas.getLista().add(item1);
		ventas.setCantidadTotal(ventas.getCantidadTotal() + item1.getCantidad());
		ventas.setImporteTotal(ventas.getImporteTotal() + item1.getImporte());
		
		// Agregar una venta 2
		VentaItem item2 = new VentaItem("Xyz", 80, 5, 400);
		ventas.getLista().add(item2);
		ventas.setCantidadTotal(ventas.getCantidadTotal() + item2.getCantidad());
		ventas.setImporteTotal(ventas.getImporteTotal() + item2.getImporte());
		
		System.out.println("Cantidad total: " + ventas.getCantidadTotal());
		System.out.println("Importe total: " + ventas.getImporteTotal());
		System.out.println(ventas.getLista());
	}

}
