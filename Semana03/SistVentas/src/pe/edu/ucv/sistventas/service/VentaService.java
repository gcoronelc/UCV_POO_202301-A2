package pe.edu.ucv.sistventas.service;

import java.util.List;
import pe.edu.ucv.sistventas.model.VentaItem;
import pe.edu.ucv.sistventas.model.Ventas;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class VentaService {
	
	private static Ventas ventas;
	
	static {
		ventas = new Ventas();
	}
	
	public void registrarVenta(VentaItem item){
		item.setImporte(item.getPrecio() * item.getCantidad());
		ventas.getLista().add(item);
		ventas.setCantidadTotal(ventas.getCantidadTotal() + item.getCantidad());
		ventas.setImporteTotal(ventas.getImporteTotal() + item.getImporte());
	}

	public int getCantidadTotal(){
		return ventas.getCantidadTotal();
	}
	
	public double getImporteTotal(){
		return ventas.getImporteTotal();
	}
	
	public List<VentaItem> getItems(){
		return ventas.getLista();
	}
	
}

