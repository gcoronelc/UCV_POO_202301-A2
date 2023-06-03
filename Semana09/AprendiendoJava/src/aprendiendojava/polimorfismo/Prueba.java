package aprendiendojava.polimorfismo;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba {
	
	public static void main(String[] args) {
		
		IFigura figura1 = new Triangulo(5, 6);
		IFigura figura2 = new Cuadrado(8);
		IFigura figura3 = new Rectangulo(5,6);
		
		System.out.println("Area del triangulo: " + figura1.calcularArea());
		System.out.println("Area del cuadrado: " + figura2.calcularArea());
		System.out.println("Area del rectangulo: " + figura3.calcularArea());
		
	}

}
