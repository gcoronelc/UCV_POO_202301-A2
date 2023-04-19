package apendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Clase2 extends Clase1{

	public Clase2() {
		super("Gustavo Coronel");
	}
	

	@Override
	public int sumar(int n1, int n2) {
		int suma = (n1 + n2) * (n1 - n2);
		return suma;
	}

	
}
