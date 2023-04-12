package pe.edu.ucv.appbanco.prueba;

import pe.edu.ucv.appbanco.service.BancoService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba {
	
	public static void main(String[] args) {
		// Variables
		double capital, tasa, importe;
		int n;
		// Datos
		capital = 1000;
		tasa = 0.05; // 5%
		n = 2; // Número de periodos
		// Proceso
		BancoService service = new BancoService();
		importe = service.obtenerImporte(capital, tasa, n);
		// Reporte	
		System.out.println("Importe: " + importe);		
	}

}
