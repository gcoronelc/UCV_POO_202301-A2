package pe.edu.ucv.appbanco.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Item {

	private double capital;
	private double tasa;
	private int periodos;
	private double importe;

	public Item() {
	}

	public Item(double capital, double tasa, int periodos, double importe) {
		this.capital = capital;
		this.tasa = tasa;
		this.periodos = periodos;
		this.importe = importe;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	public int getPeriodos() {
		return periodos;
	}

	public void setPeriodos(int periodos) {
		this.periodos = periodos;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		String cadena = "[";
		cadena += "capital:" + capital + ", ";
		cadena += "tasa:" + tasa + ", ";
		cadena += "periodos:" + periodos + ", ";
		cadena += "importe:" + importe;
		cadena += "]";
		return cadena;
	}
	
	
}
