package pe.edu.ucv.eurekabank.controller;

import pe.edu.ucv.eurekabank.model.Cuenta;
import pe.edu.ucv.eurekabank.service.EurekaService;

public class EurekaController {

	public Cuenta procesar(Cuenta cuenta) {
		cuenta.setEmpleado("0005");
		EurekaService service = new EurekaService();
		return service.crearCuenta(cuenta);
	}
	
}
