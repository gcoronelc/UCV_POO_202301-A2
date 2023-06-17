package appuniversidad.controller;

import appuniversidad.dto.VentaCursoDTO;
import appuniversidad.service.VentaService;

public class VentaControlador {
    
    VentaService service;
    
    public VentaControlador(){
        service = new VentaService();
    }
    
    public VentaCursoDTO registrarVenta(int cat, String desc, int part){
        return service.agregarVenta(cat, desc, part);
    }
    
    public String datosDeVenta(VentaCursoDTO venta){
        return service.devolverString(venta);
    }
    
    //Para no dejar en desuso al metodo imprimirDatos()
    public void imprimirEnConsola(VentaCursoDTO venta){
        service.imprimirDatos(venta);
    }
    
}
