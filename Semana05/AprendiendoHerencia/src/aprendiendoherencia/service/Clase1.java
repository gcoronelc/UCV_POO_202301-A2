package aprendiendoherencia.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Clase1 {
	
	static void mostrarMensaje(String mensaje){
		System.out.println(mensaje);
	}
	
	protected String getNombre(){
		return "Gustavo Coronel";
	}

	public int sumar(int n1, int n2) {
		return (n1 + n2);
	}
	
	public static void main(String[] args) {
		Clase1 o = new Clase1();
		System.out.println("Hola " + o.getNombre());
		mostrarMensaje("Todos somos ganadores.");
	}

}
