package pe.edu.ucv.eurekabank.controller;

import pe.edu.ucv.eurekabank.model.Empleado;
import pe.edu.ucv.eurekabank.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class LogonController {
	
	public void validarUsuario(String usuario, String clave){
		LogonService service = new LogonService();
		Empleado empleado = service.validarUsuario(usuario, clave);
	}

}
