package apendiendojava.prueba;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {
	
	public static void saludar(){
		System.out.println("Hola todos.");
	}
	
	public static void main(String[] args) {
		int arreglo[] = new int[5];
		
		arreglo[4] = 70;
		
		saludar();
		System.out.println(arreglo[4]);
		System.out.println(arreglo[5]); // Fuera del rango, Error!!!
		
	}

}
