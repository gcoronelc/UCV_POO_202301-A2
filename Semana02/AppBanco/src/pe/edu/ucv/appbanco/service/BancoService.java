package pe.edu.ucv.appbanco.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class BancoService {

	public double obtenerImporte(double capitalInicial, double interesMes, int n) {
		double importe;
		importe = capitalInicial * Math.pow(1 + interesMes, n);
		return importe;
	}

}
