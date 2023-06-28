package pe.edu.ucv.eurekabank.pruebas;

import java.sql.Connection;
import pe.edu.ucv.eurekabank.db.AccesoDB;
import pe.edu.ucv.eurekabank.model.Cuenta;
import pe.edu.ucv.eurekabank.service.EurekaService;

public class Prueba02 {
    
    
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta();
        cuenta.setClave("123456");;
        cuenta.setEmpleado("0005");
        cuenta.setMoneda("01");
        cuenta.setCliente("00003");
        cuenta.setCliente("00003");
        cuenta.setSaldo(6986.);
        try {
            EurekaService service = new EurekaService();
            service.crearCuenta(cuenta);
            System.out.println("Cuenta: " + cuenta.getCuenta());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
