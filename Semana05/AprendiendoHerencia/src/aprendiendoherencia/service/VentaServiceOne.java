package aprendiendoherencia.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class VentaServiceOne extends VentaService {

	@Override
	public double calcImporte(double precio, int cantidad) {
		return (precio * cantidad);
	}

}
