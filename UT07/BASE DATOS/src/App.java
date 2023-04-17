import java.io.*;
import java.sql.*;

import modelo.CrearConexion;

public class App {
    public static void main(String[] args) throws Exception {
        // Nos conectamos a la base de datos
        CrearConexion miConexion = new CrearConexion();
        Conection con = miConexion.hazConection;

        Statement st = con.createStatement;

        // Consulta que vamos a ejecutar
        String query = "select * from publication";
    }
}
