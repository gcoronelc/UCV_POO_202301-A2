package pe.edu.ucv.eurekabank.service;

import java.sql.Connection;
import java.sql.SQLException;
import pe.edu.ucv.eurekabank.db.AccesoDB;
import pe.edu.ucv.eurekabank.model.Cuenta;

public class EurekaService {
    
    public Cuenta crearCuenta(Cuenta cuenta){
        // Validaciones generales
        if(cuenta.getSaldo()<=0.0){
            throw new RuntimeException("Monto de apertura incorrecto.");
        }
        // Variables
        Connection cn = null;
        
        // Proceso General
        try {
            // Inicio
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            //  Obtener el codigo de la cuenta
            cuenta.setCuenta(obtenerCuenta(cn,cuenta.getEmpleado()));
            
            // Fin
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            throw new RuntimeException(e.getMessage());
        }catch(Exception e){
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            throw new RuntimeException("Error en el proceso.");
        } finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return cuenta;
    }

    private String obtenerCuenta(Connection cn, String empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
