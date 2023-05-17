package aprendiendojava.prueba;

import aprendiendojava.service.VentaConDescuentoService;
import aprendiendojava.service.VentaNormalService;
import aprendiendojava.service.spec.VentaSpec;

public class Prueba02 {
    
    public static void main(String[] args) {
        
        // Datos
        double precio = 890;
        int cantidad= 10;
        // Proceso
        VentaSpec service = new VentaConDescuentoService();
        double importe = service.calcVenta(precio, cantidad);
        // Reporte
        System.out.println("Importe: " + importe);        
    }
    
}
