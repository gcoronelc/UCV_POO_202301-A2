package pe.edu.ucv.appbanco.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.ucv.appbanco.model.Item;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Database {

	private Database() {
	}

	static List<Item> datos;

	static {
		datos = new ArrayList<>();
	}

}
