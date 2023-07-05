
package pe.edu.ucv.eurekabank.controller;

import java.util.List;
import pe.edu.ucv.eurekabank.model.Cliente;
import pe.edu.ucv.eurekabank.service.ConsultaService;


public class ConsultaController {
	
	
	public List<Cliente> getClientes(String paterno, String materno) {
		ConsultaService service  = new ConsultaService();
		return service.getClientes(paterno, materno);
	}
}
