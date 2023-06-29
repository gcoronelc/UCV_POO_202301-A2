package pe.edu.ucv.eurekabank.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.ucv.eurekabank.db.AccesoDB;
import pe.edu.ucv.eurekabank.model.Empleado;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class LogonService {

	public Empleado validarUsuario(String usuario, String clave) {
		Connection cn = null;
		Empleado empleado = null;
		String sql = "select chr_emplcodigo codigo, vch_emplpaterno paterno,";
		sql += "vch_emplmaterno materno, vch_emplnombre nombre, vch_emplciudad ciudad,";
		sql += " vch_empldireccion direccion, vch_emplusuario usuario, '*****' clave ";
		sql += "from empleado where vch_emplusuario=? and vch_emplclave = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			rs = pstm.executeQuery();
			if (!rs.next()) {
				throw new SQLException("Datos incorrectos.");
			}
			empleado = new Empleado();
			empleado.setCodigo(rs.getString("codigo"));
			empleado.setPaterno(rs.getString("paterno"));
			empleado.setMaterno(rs.getString("materno"));
			empleado.setNombre(rs.getString("nombre"));
			empleado.setCiudad(rs.getString("ciudad"));
			empleado.setDireccion(rs.getString("direccion"));
			empleado.setUsuario(rs.getString("usuario"));
			empleado.setClave(rs.getString("clave"));
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
		return empleado;
	}

}
