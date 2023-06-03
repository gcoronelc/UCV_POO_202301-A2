package demoexamen.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Punto {
	
	private int x;
	private int y;
	private int cuadrante; // 1, 2, 3 o 4;
	private double distancia;

	public Punto() {
		this.x = 0;
		this.y = 0;
		this.cuadrante = 0;
		this.distancia = 0.0;
	}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
		this.cuadrante = 0;
		this.distancia = 0.0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCuadrante() {
		return cuadrante;
	}

	public void setCuadrante(int cuadrante) {
		this.cuadrante = cuadrante;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	@Override
	public String toString() {
		String texto = "[x=" + x + ";y=" + y + ";cuadrante=" + cuadrante;
		texto += ";distancia:" + distancia + "]";
		return texto;
	}

}
