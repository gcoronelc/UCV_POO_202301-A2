package aprendiendoherencia.prueba;

import aprendiendoherencia.service.Clase1;
import aprendiendoherencia.service.Clase2;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {
	

    public static void main(String[] args) {
        Clase2 bean = new Clase2();
		  System.out.println("8 + 6 = " + bean.sumar(8, 6));
		  System.out.println("8 + 6 = " + bean.multiplicar(8, 6));
    }

}
