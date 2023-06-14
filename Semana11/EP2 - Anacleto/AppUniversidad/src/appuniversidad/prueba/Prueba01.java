package appuniversidad.prueba;

import appuniversidad.service.VentaService;
import appuniversidad.dto.VentaCursoDTO;

public class Prueba01 {

    public static void main(String[] args) {
        //Verificando el funcionamiento del programa con el ejemplo ilustrativo brindado
        //Prueba 1: Mostrar en pantalla los datos con el metodo "imprimirDatos()"
        
        //Instanciando el servicio
        VentaService service = new VentaService();
        //Creando la venta
        VentaCursoDTO venta = service.agregarVenta(1, "Desarrollo de Aplicaciones con Java", 20);
        //Imprimiento los datos
        service.imprimirDatos(venta);
    }
    
}
