package aprendiendojava.prueba;

import aprendiendojava.polimorfismo.Cuadrado;
import aprendiendojava.polimorfismo.IFigura;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba10 {
	
	public static void main(String[] args) {
		
		IFigura figura = new Cuadrado(7);
		Cuadrado bean = (Cuadrado) figura; // Correcto, es un DownCasting
		
		System.out.println("Area: " + bean.calcularArea());
		
	}

}
