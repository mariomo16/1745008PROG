package controlador;

import java.sql.*;

public class Publicaciones {

    public modelo.CrearConexion miConexion = new modelo.CrearConexion();

    private String titulo, anyoPublicacion, editorial;
    public int existencia;

    public void mostrarLibros() {
        try {

            Connection conn = miConexion.hazConexion();
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM publication";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("book_title");
                String anyoPublicacion = resultSet.getString("publish_date");
                String editorial = resultSet.getString("publish_co");
                // ... y así sucesivamente con el resto de las columnas que desees obtener

                System.out.println("ID: " + id);
                System.out.println("Título: " + titulo);
                System.out.println("Fecha Publicacion: " + anyoPublicacion);
                System.out.println("Editorial: " + editorial);
                System.out.println("------------------------------------");
            }

            // Cerrar los recursos
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: ");
            e.printStackTrace();
        }
    }

    public void buscarLibros(String titulo) {
        try {
            // Establecer conexión
            Connection conn = miConexion.hazConexion();

            // Crear consulta SQL para buscar el libro
            String query = "SELECT * FROM publication WHERE book_title = ?";

            // Preparar la declaración SQL
            PreparedStatement pstatement = conn.prepareStatement(query);
            pstatement.setString(1, titulo);

            // Ejecutar la consulta
            ResultSet rs = pstatement.executeQuery();

            // Verificar si se encontró el libro
            if (rs.next()) {
                // Obtener los detalles del libro
                titulo = rs.getString("book_title");
                anyoPublicacion = rs.getString("publish_date");
                editorial = rs.getString("publish_co");

                // Mostrar los detalles del libro
                System.out.println("");
                System.out.println("Título: " + titulo);
                System.out.println("Año de publicación: " + anyoPublicacion);
                System.out.println("Editorial: " + editorial);
                System.out.println("");
            }

            // Cerrar recursos
            rs.close();
            pstatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void añadirLibros(String titulo, String editorial, String anyoPublicacion) {
        try {
            // Establecer conexión
            Connection conn = miConexion.hazConexion();

            // Crear consulta SQL para insertar el libro
            String query = "INSERT INTO publication (book_title, publish_date, publish_co) VALUES (?, ?, ?)";

            // Preparar la declaración SQL
            PreparedStatement pstatement = conn.prepareStatement(query);
            pstatement.setString(1, titulo);
            pstatement.setString(2, anyoPublicacion);
            pstatement.setString(3, editorial);

            // Ejecutar la consulta
            int filasInsertadas = pstatement.executeUpdate();

            if (filasInsertadas > 0) {
                System.out.println("Libro agregado exitosamente.");
            } else {
                System.out.println("No se pudo agregar el libro.");
            }

            // Cerrar recursos
            pstatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: ");
            e.printStackTrace();
        }
    }

    public void modificarLibros(String titulo, String nuevoTitulo, String nuevoAnyoPublicacion, String nuevoEditorial) {
        try {
            // Establecer conexión
            Connection conn = miConexion.hazConexion();
            verificarExistencia(titulo);
            if (this.existencia == 1) {
                // Actualizar el libro en la base de datos
                String queryUpdate = "UPDATE publication SET book_title = ?, publish_date = ?, publish_co = ? WHERE book_title = ?";
                PreparedStatement pstatement = conn.prepareStatement(queryUpdate);
                pstatement.setString(1, nuevoTitulo);
                pstatement.setString(2, nuevoAnyoPublicacion);
                pstatement.setString(3, nuevoEditorial);
                pstatement.setString(4, titulo);

                int filasActualizadas = pstatement.executeUpdate();

                if (filasActualizadas > 0) {
                    System.out.println("Libro modificado exitosamente.");
                } else {
                    System.out.println("No se pudo modificar el libro.");
                }

                pstatement.close();
            }

            // Cerrar recursos
            conn.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: ");
            e.printStackTrace();
        }
    }

    public void borrarLibros(String libroABorrar) {
        try {
            Connection conn = miConexion.hazConexion();
            String query = "DELETE FROM publication WHERE book_title = ?";
            PreparedStatement pstatement = conn.prepareStatement(query);
            pstatement.setString(1, libroABorrar);

            int filasBorradas = pstatement.executeUpdate();

            if (filasBorradas > 0) {
                System.out.println("Libro borrado exitosamente.");
            } else {
                System.out.println("No se encontró ningún libro con ese título.");
            }

            // Cerrar recursos
            pstatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: ");
            e.printStackTrace();
        }
    }

    public void verificarExistencia(String titulo) {
        try {
            // Establecer conexión
            Connection conn = miConexion.hazConexion();

            // Verificar si el libro existe en la base de datos
            String query = "SELECT COUNT(*) FROM publication WHERE book_title = ?";
            PreparedStatement pstatement = conn.prepareStatement(query);
            pstatement.setString(1, titulo);
            ResultSet rs = pstatement.executeQuery();
            rs.next();
            int existencia = rs.getInt(1);
            this.existencia = existencia;
            if (existencia == 0) {
                System.out.println("No se encontró ningún libro con ese título.");
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: ");
            e.printStackTrace();
        }
    }
}
