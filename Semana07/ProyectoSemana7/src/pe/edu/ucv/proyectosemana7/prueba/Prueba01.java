package pe.edu.ucv.proyectosemana7.prueba;

import pe.edu.ucv.proyectosemana7.dto.ServicioDto;
import pe.edu.ucv.proyectosemana7.service.TelecoMarcoService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		ServicioDto dto;
		TelecoMarcoService service;
		// Datos
		dto = new ServicioDto("12345678", "Juan peres", "A", "Local", 10);
		// Proceso
		service =new TelecoMarcoService();
		dto = service.procesarServicio(dto);
		// Reporte
		System.out.println("Importe: " + dto.getImporte());
		System.out.println("Impuesto: " + dto.getImpuesto());
		System.out.println("Total: " + dto.getTotal());

	}

}
