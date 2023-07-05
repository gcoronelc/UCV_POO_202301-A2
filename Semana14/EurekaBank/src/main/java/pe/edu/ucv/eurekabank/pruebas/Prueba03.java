package pe.edu.ucv.eurekabank.pruebas;

import java.util.List;
import pe.edu.ucv.eurekabank.model.Combo;
import pe.edu.ucv.eurekabank.model.Cuenta;
import pe.edu.ucv.eurekabank.service.ComboService;
import pe.edu.ucv.eurekabank.service.EurekaService;

public class Prueba03 {

	public static void main(String[] args) {

		ComboService service = new ComboService();
		List<Combo> lista = service.getMonedas();
		try {
			for(Combo item: lista){
				System.out.println(item);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
