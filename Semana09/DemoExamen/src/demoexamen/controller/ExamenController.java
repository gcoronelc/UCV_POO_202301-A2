package demoexamen.controller;

import demoexamen.model.Punto;
import demoexamen.service.ExamenService;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class ExamenController {

	private ExamenService service;

	public ExamenController() {
		service = new ExamenService();
	}

	public List<Punto> procesar(int n) {
		service.setValorN(n);
		service.generarPuntos();
		service.procesarPuntos();
		List<Punto> lista = service.obtenerPuntos();
		return lista;
	}

}
