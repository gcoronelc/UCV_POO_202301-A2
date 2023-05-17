package aprendiendojava.service;

import aprendiendojava.service.spec.VentaSpec;

public class VentaFactory {

	// Tipos de VENTAS
	public static final String VENTA_NORMAL = "VENTA NORMAL";
	public static final String VENTA_CON_DESCUENTO = "VENTA CON DESCUENTO";

	private VentaFactory() {
	}

	public static VentaSpec getVentaService(String tipoVenta) {
		// Variables
		VentaSpec service = null;
		// Proceso
		switch (tipoVenta) {
			case VENTA_NORMAL:
				service = new VentaNormalService();
				break;
			case VENTA_CON_DESCUENTO:
				service = new VentaConDescuentoService();
				break;
		}
		// Reporte
		return service;
	}
	
	public static String[] getTipos(){
		// Proceso
		String[] tipos = {VENTA_NORMAL, VENTA_CON_DESCUENTO};
		// Reporte
		return tipos;
	}

}
