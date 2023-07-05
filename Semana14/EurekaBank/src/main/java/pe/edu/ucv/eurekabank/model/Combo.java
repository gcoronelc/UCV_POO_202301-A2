package pe.edu.ucv.eurekabank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Combo {
    
    private String codigo;
    private String nombre;

	@Override
	public String toString() {
		return nombre;
	}

	 
    
}
