package ventaapp.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class VentaService {

	public double calcularTotal(double precio, int cantidad) {
		return (precio * cantidad);
	}

	public double calcularImporte(double total) {
		return (total / 1.18);
	}

	public double calcularImpuesto(double total, double importe) {
		return (total - importe);
	}

}
