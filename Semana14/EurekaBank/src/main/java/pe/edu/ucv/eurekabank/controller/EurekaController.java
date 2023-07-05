package pe.edu.ucv.eurekabank.controller;

import pe.edu.ucv.eurekabank.model.Cuenta;
import pe.edu.ucv.eurekabank.model.Empleado;
import pe.edu.ucv.eurekabank.service.EurekaService;
import pe.edu.ucv.eurekabank.util.Session;

public class EurekaController {

	public Cuenta procesar(Cuenta cuenta) {
		Empleado usuario = (Empleado) Session.get("usuario");
		cuenta.setEmpleado(usuario.getCodigo());
		EurekaService service = new EurekaService();
		return service.crearCuenta(cuenta);
	}
	
}
