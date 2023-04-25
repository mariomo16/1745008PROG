package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrearConexion {

    //Parámetros de la conexión
    private String driver = "jdbc:mysql://";
    private String host="localhost";
    private String port="3306";
    private String database="apressBooks";
    private String user = "usuario3PAW";
    private String password = "P@ssw0rd";

    /**
     * 
     * Método para conectarnos a la base de datos
     * @return el ID de la conexión
     * @throws SQLException
     */
    public Connection hazConnection() throws SQLException {
        Connection con = null;

        // detalles de la conexión (servidor, puerto y base de datos)
        String urlConexion = driver + host + ":" +
        port + "/" + database;
        
        con = DriverManager.getConnection(urlConexion, user, password);    

        return con;

    }


}
