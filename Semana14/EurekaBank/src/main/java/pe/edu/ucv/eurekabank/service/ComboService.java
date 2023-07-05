package pe.edu.ucv.eurekabank.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.ucv.eurekabank.db.AccesoDB;
import pe.edu.ucv.eurekabank.model.Combo;
import pe.edu.ucv.eurekabank.model.Empleado;

public class ComboService {


    public List<Combo> getMonedas(){
        List<Combo> lista = new ArrayList<>();
        Connection cn = null;
        Empleado empleado = null;
        String sql = "select chr_monecodigo codigo, ";
		  sql += "CONCAT(chr_monecodigo,' - ',vch_monedescripcion) nombre ";
		  sql += "FROM moneda";
		  PreparedStatement pstm = null;
        ResultSet rs = null;
		  Combo bean = null;
        try {
            cn = AccesoDB.getConnection();
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
				while (rs.next()) {
					bean = new Combo();
					bean.setCodigo(rs.getString("codigo"));
					bean.setNombre(rs.getString("nombre"));
					lista.add(bean);
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error en el proceso, intentelo nuevmante.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }

    
}
