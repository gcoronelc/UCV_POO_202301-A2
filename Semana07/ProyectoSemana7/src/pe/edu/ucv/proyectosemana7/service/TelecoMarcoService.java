
package pe.edu.ucv.proyectosemana7.service;

import pe.edu.ucv.proyectosemana7.dto.ServicioDto;


public class TelecoMarcoService {
	
	
	public ServicioDto procesarServicio(ServicioDto dto){
		// Variables
		double costoMin;
		double importe;
		double impuesto;
		double total;
		// Proceso
		costoMin = obtenerCostoMin(dto.getPlan(), dto.getTipo());
		importe = costoMin * dto.getDuracion();
		impuesto =importe * 0.18;
		total = importe + impuesto;
		// Reporte
		dto.setCostoMin(costoMin);
		dto.setImporte(importe);
		dto.setImpuesto(impuesto);
		dto.setTotal(total);
		return dto;		
	}

	private double obtenerCostoMin(String plan, String tipo) {
		// Variables
		double costoMin;
		// Proceso
		costoMin = 0.0;
		switch(plan){
			case "A":
				if(tipo.equals("Local")){
					costoMin= 0.20;
				} else if(tipo.equals("Celular")){
					costoMin=0.40;
				}
				break;
			case "B":
				if(tipo.equals("Local")){
					costoMin= 0.15;
				} else if(tipo.equals("Celular")){
					costoMin=0.30;
				}
				break;
				
		}
		// Reporte
		return costoMin;
	
	}
	
}
