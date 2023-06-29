package pe.edu.ucv.eurekabank.model;

import lombok.Data;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
@Data
public class Empleado {

	private String codigo;
	private String paterno;
	private String materno;
	private String nombre;
	private String ciudad;
	private String direccion;
	private String usuario;
	private String clave;


}
