package aprendiendojava.controller;

import aprendiendojava.service.VentaFactory;

public class VentaController {
	
	
	public String[] getTipos(){
		return VentaFactory.getTipos();
	}
	
	
	public double procesarVenta(String tipo, double precio, int cantidad){
		return VentaFactory
				  .getVentaService(tipo)
				  .calcVenta(precio, cantidad);
	}
	

}
