package pe.edu.ucv.eurekabank.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.ucv.eurekabank.db.AccesoDB;
import pe.edu.ucv.eurekabank.model.Cliente;
import pe.edu.ucv.eurekabank.model.Combo;
import pe.edu.ucv.eurekabank.model.Empleado;

public class ConsultaService {

	public List<Cliente> getClientes(String paterno, String materno) {
		List<Cliente> lista = new ArrayList<>();
		Connection cn = null;
		Cliente cliente = null;
		String sql = "select chr_cliecodigo     codigo,    "
				  + "vch_cliepaterno    paterno,   "
				  + "vch_cliematerno    materno,   "
				  + "vch_clienombre     nombre,    "
				  + "chr_cliedni        dni,       "
				  + "vch_clieciudad     ciudad,    "
				  + "vch_cliedireccion  direccion ,"
				  + "vch_clietelefono   telefono,  "
				  + "vch_clieemail      email  "
				  + "from cliente "
				  + "where vch_cliepaterno like ?   "
				  + "and vch_cliematerno like ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		paterno = "%" + paterno.trim() + "%";
		materno = "%" + materno.trim() + "%";
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, paterno);
			pstm.setString(2, materno);
			rs = pstm.executeQuery();
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setCodigo(rs.getString("codigo"));
				cliente.setPaterno(rs.getString("paterno"));
				cliente.setMaterno(rs.getString("materno"));
				cliente.setNombre(rs.getString("codigo"));
				cliente.setDni(rs.getString("dni"));
				cliente.setCiudad(rs.getString("ciudad"));
				cliente.setDireccion(rs.getString("direccion"));
				cliente.setTelefono(rs.getString("telefono"));
				cliente.setEmail(rs.getString("email"));
				lista.add(cliente);
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();
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
