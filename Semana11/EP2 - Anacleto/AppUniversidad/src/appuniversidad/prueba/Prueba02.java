package appuniversidad.prueba;

import appuniversidad.service.VentaService;
import appuniversidad.dto.VentaCursoDTO;

public class Prueba02 {

    public static void main(String[] args) {
        //Verificando el funcionamiento del programa con el ejemplo ilustrativo brindado
        //Prueba 2: Mostrar en pantalla los datos con el metodo devolverString()
        
        //Instanciando el servicio
        VentaService service = new VentaService();
        //Creando la venta
        VentaCursoDTO venta = service.agregarVenta(1, "Desarrollo de Aplicaciones con Java", 20);
        //Obteniendo el String
        String datos = service.devolverString(venta);
        //Imprimir en pantalla
        System.out.println(datos);
    }
    
}
