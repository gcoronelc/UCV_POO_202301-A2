package pe.edu.ucv.eurekabank.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            //  Obtener sucursal
            cuenta.setSucursal(obtenerSucursal(cn,cuenta.getEmpleado()));
            // Obtener codigo de cuenta
            cuenta.setCuenta(obtenerCuenta(cn,cuenta.getSucursal()));
            // Insertar cuenta
            insertarCuenta(cn,cuenta);
            // Insertar Movimiento
            insertarMovimendo(cn,cuenta);
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
    
    private String obtenerSucursal(Connection cn, String empleado) throws SQLException {
        // Variables
        String sql;
        PreparedStatement pstm;
        ResultSet rs;
        String sucursal;
        // Obtener codigo de sucursal
        sql = "select chr_sucucodigo sucursal from dbo.Asignado ";
        sql += "where chr_emplcodigo=? and dtt_asigfechabaja is null";
        pstm = cn.prepareStatement(sql);
        pstm.setString(1, empleado);
        rs = pstm.executeQuery();
        if(!rs.next()){
            throw new SQLException("Empleado no existe o no esta autorizado.");
        }
        sucursal = rs.getString("sucursal");
        rs.close();
        pstm.close();
        // Fin
        return sucursal;
    }
    

    private String obtenerCuenta(Connection cn, String sucursal) throws SQLException {
        // Variables
        String sql;
        PreparedStatement pstm;
        ResultSet rs;
        int contador;
        int filas;
        String cuenta;
        // Obtener contador de la sucursal
        sql = "select int_sucucontcuenta contador from sucursal ";
        sql += "where chr_sucucodigo = ?";
        pstm = cn.prepareStatement(sql);
        pstm.setString(1, sucursal);
        rs = pstm.executeQuery();
        if(!rs.next()){
            throw new SQLException("Codigo de sucursal incorrecto.");
        }
        contador = rs.getInt("contador") + 1;
        //Actualizar el contador
        sql = "update dbo.Sucursal set int_sucucontcuenta = ? ";
        sql += "where chr_sucucodigo = ?";
        pstm = cn.prepareStatement(sql);
        pstm.setInt(1, contador);
        pstm.setString(2, sucursal);
        filas = pstm.executeUpdate();
        if(filas != 1){
            throw new SQLException("Error al actualizar la sucursal.");
        }
        // General la cuenta
        cuenta = "000000000" + contador;
        cuenta = sucursal + cuenta.substring(cuenta.length()-5, cuenta.length());
        // Fin
        return cuenta;
    }

    private void insertarCuenta(Connection cn, Cuenta cuenta) throws SQLException {
        // Variables
        String sql;
        PreparedStatement pstm;
        // Proceso
        sql = "insert into cuenta(chr_cuencodigo,chr_monecodigo,chr_sucucodigo,";
        sql += "chr_emplcreacuenta,chr_cliecodigo,dec_cuensaldo,";
        sql += "dtt_cuenfechacreacion,vch_cuenestado,int_cuencontmov,chr_cuenclave) ";
        sql += "values(?,?,?,?,?,?,GETDATE(),'ACTIVO',1,?)";
        pstm = cn.prepareStatement(sql);
        pstm.setString(1, cuenta.getCuenta());
        pstm.setString(2, cuenta.getMoneda());
        pstm.setString(3, cuenta.getSucursal());
        pstm.setString(4, cuenta.getEmpleado());
        pstm.setString(5, cuenta.getCliente());
        pstm.setDouble(6, cuenta.getSaldo());
        pstm.setString(7, cuenta.getClave());
        pstm.executeUpdate();
    }

    private void insertarMovimendo(Connection cn, Cuenta cuenta) throws SQLException {
        // Variables
        String sql;
        PreparedStatement pstm;
        // Proceso
        sql = "insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,";
        sql += "chr_emplcodigo,chr_tipocodigo,dec_moviimporte,chr_cuenreferencia) ";
        sql += "values(?,1,GETDATE(),?,'001',?,NULL)";
        pstm = cn.prepareStatement(sql);
        pstm.setString(1, cuenta.getCuenta());
        pstm.setString(2, cuenta.getEmpleado());
        pstm.setDouble(3, cuenta.getSaldo());
        pstm.executeUpdate();
    }
    
}
