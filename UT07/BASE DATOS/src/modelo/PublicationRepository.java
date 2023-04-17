package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PublicationRepository {
    
    // la colección de libros de la base de datos
    private ArrayList<Publication> repositorio = 
        new ArrayList<Publication>();

    public PublicationRepository() {
        // nos conectamos a la base de datos
        CrearConexion miConexion = new CrearConexion();

        try (Connection conexion = miConexion.hazConnection();
        Statement sentencia = conexion.createStatement();) {
            // sentencia e ejecutar
            String query = "select * from publication";
            // ejecuto la sentencia y guardo el resultado en rs
            ResultSet rs = sentencia.executeQuery(query);

            while (rs.next()) {
                // obtengo los datos del resultado
                String bookTitle = rs.getString("book_title");
                String publishDate = rs.getString("publish_date");
                String publishCo = rs.getString("publish_co");
                Integer id = rs.getInt("id");

                //Lo asigno a un objeto Publication
                Publication p = new Publication(
                    id , bookTitle, publishDate,
                    publishCo
                );
                // lo agregamos a la colección
                repositorio.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar");
        }
    }

    public Publication buscarPorId(Integer id) {
        Publication p = null;
        for (Publication pub : repositorio) {
            if (pub.getId() == id) {
                p = pub;
                break;
            }
        }
        return p;
    }

}
