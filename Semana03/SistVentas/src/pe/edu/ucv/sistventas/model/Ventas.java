package pe.edu.ucv.sistventas.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Ventas {

	private int cantidadTotal;
	private double importeTotal;
	private List<VentaItem> lista;

	public Ventas() {
		this.lista = new ArrayList<>();
		this.cantidadTotal = 0;
		this.importeTotal = 0.0;
	}

	public int getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	public double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public List<VentaItem> getLista() {
		return lista;
	}

	public void setLista(List<VentaItem> lista) {
		this.lista = lista;
	}

}
