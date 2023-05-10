package aprendiendojava.prueba;

import aprendiendojava.service.VentaFactory;
import aprendiendojava.service.spec.VentaSpec;

public class Prueba03 {

	public static void main(String[] args) {
		// Datos
		double precio = 890;
		int cantidad = 10;
		// Proceso
		VentaSpec service = VentaFactory.getVentaService(VentaFactory.VENTA_CON_DESCUENTO);
		double importe = service.calcVenta(precio, cantidad);
		// Reporte
		System.out.println("Importe: " + importe);
	}

}
