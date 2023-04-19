package apendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Clase1 {

	/**
	 * Constructor por defecto de Clase1
	 */
	public Clase1() {
		System.out.println("Hola desde Clase1");
	}
	
	/**
	 * Constructor adicional de Clase1
	 * @param nombre Nombre del usuario.
	 */
	public Clase1(String nombre) {
		System.out.println("Hola " + nombre + " desde Clase1");
	}
	
	
	
	
	
	public int sumar(int n1, int n2){
		return (n1 + n2);
	}
	
	public double sumar(double n1, double n2){
		return (n1 + n2);
	}

}
