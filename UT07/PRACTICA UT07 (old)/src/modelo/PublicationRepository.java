package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.exceptions.MySQLTransactionRollbackException;
import com.mysql.cj.protocol.Resultset;

public class PublicationRepository {
    
    //La colección de libros de la base de datos
    private ArrayList<Publication> repositorio = 
        new ArrayList<Publication>();

    //Id del proximo elemento a insertar
    private int proximoId;

    // nos conectamos a la base de datos
    CrearConexion miConexion = new CrearConexion();

    Publication publication = new Publication(null, null, null, null);

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

    public void modificar() {
        try (Connection conexion = miConexion.hazConexion();
        Statement sentencia = conexion.createStatement();) {

            sentencia = miConexion.hazConexion().prepareStatement("UPDATE apressBooks SET book_title = ?, publish_co = ?, publish_date = ? WHERE id = ?");
            sentencia.setString(1, nuevoTitulo != null ? nuevoTitulo : publication.getBookTitle());
            sentencia.setString(3, nuevaEditorial != null ? nuevaEditorial : publication.getPublishCo());
            sentencia.setInt(4, nuevoAnioPublicacion != null ? nuevoAnioPublicacion : publication.getPublishDate());
            sentencia.setInt(5, publication.getId());

            sentencia.executeUpdate(null);
            sentencia.close();
            miConexion.hazConexion().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Object borrar(Integer id) {
        try (Connection conexion = miConexion.hazConexion();
        Statement sentencia = conexion.createStatement();) {

            miConexion.hazConexion();

            sentencia = miConexion.hazConexion().prepareStatement("DELETE FROM apressBooks WHERE id = ?");
            sentencia.setInt(1, publication.getId());

            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea borrar el libro?", "Confirmación de borrado", JOptionPane.YES_NO_OPTION);
            
            if (confirmacion == JOptionPane.YES_OPTION) {
                sentencia.executeUpdate(null);
            }
            sentencia.close();
            miConexion.hazConexion().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public <libro> String mostrar(){
        try (Connection conexion = miConexion.hazConexion();
        Statement sentencia = conexion.createStatement();) {

            sentencia = miConexion.hazConexion().prepareStatement("SELECT * FROM libros");
            ResultSet rs = sentencia.executeQuery(null);
            List<libro> libros = new ArrayList<>();

            while (rs.next()) {
                publication.setid(rs.getInt("id"));
                publication.setBookTitle(rs.getString("book_title"));
                publication.setPublishCo(rs.getString("publish_co"));
                publication.setPublishDate(rs.getString("publish_date"));
                libros.add(publication.getBookTitle());
            }
            sentencia.close();
            miConexion.hazConexion().close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return libros;
    }

}
