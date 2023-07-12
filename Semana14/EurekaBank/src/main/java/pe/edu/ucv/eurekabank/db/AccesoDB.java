package pe.edu.ucv.eurekabank.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

    // Constructor privado
    private AccesoDB() {
    }

    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //String urlDB = "jdbc:sqlserver://10.30.122.50:1433;databaseName=EUREKABANK;encrypt=true;TrustServerCertificate=true;";
        String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=EUREKABANK;encrypt=true;TrustServerCertificate=true;";
        String user = "sa";
        String pass = "sql";
        try {
            // Paso 1: Cargar el driver a memoria 
            Class.forName(driver).getDeclaredConstructor().newInstance();
            // Paso 2: Obtener el objeto Connection 
            cn = DriverManager.getConnection(urlDB, user, pass);
        } catch (SQLException e) {
            throw e; // propagar la excepcion
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontro el driver de la base de datos.");
        } catch (Exception e) {
            throw new SQLException("No se puede establecer la conexion con la BD.");
        }
        return cn;
    }

}
