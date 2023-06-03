package aprendiendojava.prueba;

import aprendiendojava.polimorfismo.Cuadrado;
import aprendiendojava.polimorfismo.IFigura;
import aprendiendojava.polimorfismo.Triangulo;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba11 {
	
	public static void main(String[] args) {
		
		IFigura figura = new Triangulo(7,8);
		Cuadrado bean = (Cuadrado) figura; // Incorrecto, no existe relación jerarquica entre Triangulo y Cuadrado
		
		System.out.println("Area: " + bean.calcularArea());
		
	}

}
