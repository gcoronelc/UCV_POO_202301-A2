package appuniversidad.prueba;

import appuniversidad.service.VentaService;
import appuniversidad.dto.VentaCursoDTO;

public class Prueba03 {

    public static void main(String[] args) {
        //Verificando el funcionamiento del programa con varios ejemplos
        //Prueba 3: Mostrar en pantalla distintos casos de ventas para verificar el funcionamiento
        
        //Instanciando el servicio
        VentaService service = new VentaService();
        //Creando las ventas
        VentaCursoDTO venta1 = service.agregarVenta(1, "Desarrollo de Aplicaciones con Java", 20);
        VentaCursoDTO venta2 = service.agregarVenta(1, "Desarrollo de Aplicaciones con Python", 8);
        VentaCursoDTO venta3 = service.agregarVenta(4, "Liderazgo", 25);
        VentaCursoDTO venta4 = service.agregarVenta(3, "Introduccion a la administracion", 5);
        //Imprimiento los datos
        System.out.println(service.devolverString(venta1));
        System.out.println("\n" + service.devolverString(venta2));
        System.out.println("\n" + service.devolverString(venta3));
        System.out.println("\n" + service.devolverString(venta4));
        
    }
    
}
