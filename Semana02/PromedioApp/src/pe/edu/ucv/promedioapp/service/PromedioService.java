package pe.edu.ucv.promedioapp.service;

import java.util.Arrays;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class PromedioService {
	
	public int promPracticas(int pc1, int pc2, int pc3, int pc4){
		// Variables
		int menor, pp;
		// Proceso
		menor = obtenerMenor(pc1, pc2, pc3, pc4);
		pp = (pc1 + pc2 + pc3 + pc4 - menor) / 3;
		// Reporte
		return pp;
	}
	
	public int promFinal(int pp, int ep, int ef){
		// Variables
		int pf;
		// Proceso
		pf = (int) (pp*0.30 + ep*0.30 + ef*0.40);
		// Reporte
		return pf;
	}

	private int obtenerMenor(int ... notas) {
		Arrays.sort(notas);
		return notas[0];
	}

}
