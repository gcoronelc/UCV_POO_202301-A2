package aprendiendoherencia.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Clase2 extends Clase1 {

	@Override
	public int sumar(int n1, int n2) {
		int suma = (n1 + n2) * (n1 - n2);
		return suma;
	}

	public int multiplicar(int n1, int n2) {
		return (n1 * n2);
	}

	public static void main(String[] args) {
		Clase1 o = new Clase1();
		System.out.println("Hola " + o.getNombre());
	}

}
