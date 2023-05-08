package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PublicationRepository {
    
    //La colección de libros de la base de datos
    private ArrayList<Publication> repositorio = 
        new ArrayList<Publication>();

    //Id del proximo elemento a insertar
    private int proximoId;

    // nos conectamos a la base de datos
    CrearConexion miConexion = new CrearConexion();

    public PublicationRepository() {        
        try (Connection conexion = miConexion.hazConexion();
        Statement sentencia = conexion.createStatement();) {
            //sentencia e ejecutar
            String query = "select * from publication";
            //ejecuto la sentencia y guardo el resultado en rs
            ResultSet rs = sentencia.executeQuery(query);
            Integer id=0;
            while (rs.next()) {
                //obtengo los datos del resultado
                String bookTitle = rs.getString("book_title");
                String publishDate = rs.getString("publish_date");
                String publishCo = rs.getString("publish_co");
                id = rs.getInt("id");

                //Lo asigno a un objeto Publication
                Publication p = new Publication(
                    id , bookTitle, publishDate,
                    publishCo
                );
                //Lo agregamos a la colección
                repositorio.add(p);
            }

            proximoId = id + 1;

        } catch (SQLException e) {
            System.out.println("Error al conectar");
            e.printStackTrace();
        }
    }


    public int getProximoId() {
        return proximoId;
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


    public ArrayList<Publication> getRepositorio() {
        return repositorio;
    }
    
    public void insertar(Publication libro) {
        repositorio.add(libro);
        proximoId++;
    }


    public void insertarLibro(Publication libro) {

        String query = "";

        try (Connection conexion = miConexion.hazConexion();
        Statement sentencia = conexion.createStatement();) {
            query = "INSERT INTO publication VALUES (0 , '" 
            + libro.getBookTitle() + "' , '" + 
            libro.getPublishDate()+ "' , '" +
            libro.getPublishCo() + "')";
            sentencia.executeUpdate(query);
            // close connection
            sentencia.close();            
        }
        catch (Exception e){
            System.out.println("Error->" + query);
        }

    }

    public void grabarRepositorio () {
        try (Connection conexion = miConexion.hazConexion();
        Statement sentencia = conexion.createStatement();) {
            String borrado = "TRUNCATE TABLE publication";
            sentencia.executeUpdate(borrado);
            // close connection
            sentencia.close();
        }
        catch (Exception e){
            System.out.println("Error al borrar");
        }
        for (Publication libro : repositorio) {
            insertarLibro(libro);
        }
    }

    public boolean modificar(Integer id , Publication libro) {
        return false;
    }

    public Object borrar(Integer id) {
        return null;
    }

    public String mostrar(){
        return null;
    }

}
