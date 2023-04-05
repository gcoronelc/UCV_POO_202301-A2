package ventaapp.prueba;

import ventaapp.service.VentaService;

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
		// Datos
		double precio = 100;
		int cantidad = 8;
		// Proceso
		VentaService service = new VentaService();
		double total = service.calcularTotal(precio, cantidad);
		double importe = service.calcularImporte(total);
		double impuesto = service.calcularImpuesto(total, importe);
		// Reporte
		System.out.println("Importe: " + importe);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total: " + total);
	}

}
