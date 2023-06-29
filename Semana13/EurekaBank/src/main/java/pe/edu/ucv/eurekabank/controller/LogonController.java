package pe.edu.ucv.eurekabank.controller;

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
		if(usuario.equals("gustavo") && clave.equals("coronel")){
			System.out.println("Bien");
		} else {
			throw  new RuntimeException("Datos incorrectos!!");
		}
	}

}
