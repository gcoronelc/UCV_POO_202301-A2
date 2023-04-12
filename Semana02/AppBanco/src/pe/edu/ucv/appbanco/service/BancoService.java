package pe.edu.ucv.appbanco.service;

import java.util.List;
import pe.edu.ucv.appbanco.model.Item;

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
		// Variables
		double importe;
		// Proceso
		importe = capitalInicial * Math.pow(1 + interesMes, n);
		Item item = new Item(capitalInicial, interesMes, n, importe);
		Database.datos.add(item);
		// Reporte
		return importe;
	}
	
	public List<Item> obtenerListado(){
		return Database.datos;
	}

}
