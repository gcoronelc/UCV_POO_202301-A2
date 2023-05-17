package aprendiendojava.service;

import aprendiendojava.service.spec.VentaSpec;


public class VentaConDescuentoService implements VentaSpec{

    @Override
    public double calcVenta(double precio, int cantidad) {
        // Variables
        double valorVenta;
        // Proceso
        valorVenta = precio * cantidad * 0.95;
        //Reporte
        return valorVenta;
    }
    
}
