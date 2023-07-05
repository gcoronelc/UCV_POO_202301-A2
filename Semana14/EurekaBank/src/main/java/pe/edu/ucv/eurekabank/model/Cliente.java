package pe.edu.ucv.eurekabank.model;

import lombok.Data;

@Data
public class Cliente {

	private String codigo;
	private String paterno;
	private String materno;
	private String nombre;
	private String dni;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String email;
}
