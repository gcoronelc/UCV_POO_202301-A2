package pe.edu.ucv.eurekabank.controller;

import java.util.List;
import pe.edu.ucv.eurekabank.model.Combo;
import pe.edu.ucv.eurekabank.service.ComboService;

public class ComboController {

	private ComboService comboService;

	public ComboController() {
		comboService = new ComboService();
	}

	public List<Combo> getMonedas() {
		return comboService.getMonedas();
	}
}
