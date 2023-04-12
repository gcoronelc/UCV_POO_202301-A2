package pe.edu.ucv.promedioapp.prueba;

import pe.edu.ucv.promedioapp.service.PromedioService;

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
		// Variables
		int pc1, pc2, pc3, pc4, pp;
		int ep, ef, pf;
		// Datos
		pc1 = 17;
		pc2 = 20;
		pc3 = 19;
		pc4 = 15;
		ep = 8;
		ef = 18;
		// Proceso
		PromedioService service = new PromedioService();
		pp = service.promPracticas(pc1, pc2, pc3, pc4);
		pf = service.promFinal(pp, ep, ef);
		// Reporte
		System.out.println("PP: " + pp);
		System.out.println("PF: " + pf);
	}

}
