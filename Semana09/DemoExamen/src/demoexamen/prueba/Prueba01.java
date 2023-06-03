package demoexamen.prueba;

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
public class Prueba01 {
	
	public static void main(String[] args) {
		// Crear servicio
		ExamenService service = new ExamenService();
		// Proceso
		service.setValorN(20);
		service.generarPuntos();
		service.procesarPuntos();
		List<Punto> lista = service.obtenerPuntos();
		// Reporte
		for (Punto punto : lista) {
			System.out.println(punto);
		}
		
	}

}
