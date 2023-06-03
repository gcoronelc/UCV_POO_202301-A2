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
public class Prueba09 {
	
	public static void main(String[] args) {
		
		Cuadrado bean = new Cuadrado(7);
		IFigura figura = bean; // Es correcto, esto es UpCasting
		
		System.out.println("Area: " + figura.calcularArea());
		
		
		
	}

}
