package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrearConexion {

    // Parámetros de la conexión
    private static String driver = "jdbc:mysql://";
    private static String host = "localhost";
    private static String port = "3306";
    private static String database = "apressBooks";
    private static String user = "usuario3PAW";
    private static String password = "P@ssw0rd";

    /*
     *
     * Método para conectarnos a la base de datos
     * @return el ID de la conexion
     * @throws SQLException
     */
    public Connection hazConection() throws SQLException {
        Conection con = null;

        // Detalles de la conexión (servidor, puerto y base de datos)
        String urlConexion = 
        this.driver +
        this.host + 
        ":" + this.port + 
        "/" + this.database;

        try {
            // Driver que vamos a usar
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Conectamos a la base de datos
            con = DriverManager.getConection(urlConexion, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver");
        }

        return con;
    }
    
}
