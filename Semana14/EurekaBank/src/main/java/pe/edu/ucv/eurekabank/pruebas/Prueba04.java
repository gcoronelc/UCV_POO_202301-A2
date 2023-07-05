package pe.edu.ucv.eurekabank.pruebas;

import java.util.List;
import pe.edu.ucv.eurekabank.model.Cliente;
import pe.edu.ucv.eurekabank.service.ConsultaService;

public class Prueba04 {

	public static void main(String[] args) {

		ConsultaService service = new ConsultaService();
		
		List<Cliente> lista = service.getClientes("C", "");
		try {
			for(Cliente item: lista){
				System.out.println(item.getCodigo());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
