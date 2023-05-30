package controlador;

import java.sql.*;

public class Publicaciones {

    public modelo.CrearConexion miConexion = new modelo.CrearConexion();

    private String titulo, anyoPublicacion,editorial;
    public int existencia;

    public void mostrarLibros() {
        try {
            // Establecemos la conexión y creamos consulta SQL para buscar en la base de datos
            Connection conn = miConexion.hazConexion();
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM publication";

            // Ejecutamos la consulta
            ResultSet resultSet = statement.executeQuery(query);

            // Obtenenemos los resultados de la consulta
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                titulo = resultSet.getString("book_title");
                anyoPublicacion = resultSet.getString("publish_date");
                editorial = resultSet.getString("publish_co");

                // Mostrar los resultados por pantalla
                System.out.println("");
                System.out.println("ID: " + id);
                System.out.println("Título: " + titulo);
                System.out.println("Fecha Publicacion: " + anyoPublicacion);
                System.out.println("Editorial: " + editorial);
                System.out.println("------------------------------------");
                System.out.println("");
            }

            // Cerrar los recursos
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            // En el caso de que ocurra algun error,
            // se muestra un mensaje "Ha ocurrido un error"
            // y a continuacion se muestra el mensaje de error para poder identificarlo
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("");
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
            // En el caso de que ocurra algun error,
            // se muestra un mensaje "Ha ocurrido un error"
            // y a continuacion se muestra el mensaje de error para poder identificarlo
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("");
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

            // Comprobamos si se a actualizado alguna fila de la base de datos
            // y mostramos un mensaje en cualquier caso
            // indicando si el libro se ha añadido o no
            if (filasInsertadas > 0) {
                System.out.println("Libro agregado exitosamente.");
                System.out.println("");
            } else {
                System.out.println("No se pudo agregar el libro.");
                System.out.println("");
            }

            // Cerrar recursos
            pstatement.close();
            conn.close();
        } catch (SQLException e) {
            // En el caso de que ocurra algun error,
            // se muestra un mensaje "Ha ocurrido un error"
            // y a continuacion se muestra el mensaje de error para poder identificarlo
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("");
        }
    }

    public void modificarLibros(String titulo, String nuevoTitulo, String nuevoAnyoPublicacion, String nuevoEditorial) {
        try {
            // Establecer conexión
            Connection conn = miConexion.hazConexion();
            // Verificamos si existe algun libro con el titulo introducido en la base de datos
            verificarExistencia(titulo);
            if (this.existencia == 1) {
                // Busco el titulo en la base de datos para comprobar sus valores (nombre, editorial...)
                // para en el caso de que el usuario no quiera cambiar un campo, tenga guardado
                // los valores para que no se modifiquen
                String queryCheck = "SELECT * FROM publication WHERE book_title = ?";
                PreparedStatement ppstatement = conn.prepareStatement(queryCheck);
                ppstatement.setString(1, titulo);
                ResultSet rs = ppstatement.executeQuery();
                if (rs.next()) {
                    // Obtener los detalles del libro
                    this.titulo = rs.getString("book_title");
                    this.anyoPublicacion = rs.getString("publish_date");
                    this.editorial = rs.getString("publish_co");
                }

                // Actualizar el libro en la base de datos
                String queryUpdate = "UPDATE publication SET book_title = ?, publish_date = ?, publish_co = ? WHERE book_title = ?";
                PreparedStatement pstatement = conn.prepareStatement(queryUpdate);

                // TITULO
                if (nuevoTitulo.equals("")) {
                    nuevoTitulo = this.titulo;
                }
                pstatement.setString(1, nuevoTitulo);

                // AÑO PUBLICACION
                if (nuevoAnyoPublicacion.equals("")) {
                    nuevoAnyoPublicacion = this.anyoPublicacion;
                }
                pstatement.setString(2, nuevoAnyoPublicacion);

                // EDITORIAL
                if (nuevoEditorial.equals("")) {
                    nuevoEditorial = this.editorial;
                }
                pstatement.setString(3, nuevoEditorial);

                // Indicamos que libro queremos introducir los nuevos datos
                pstatement.setString(4, titulo);

                // Ejecutamos la consulta
                int filasActualizadas = pstatement.executeUpdate();

                // Comprobamos si se a actualizado alguna fila de la base de datos
                // y mostramos un mensaje en cualquier caso
                // indicando si el libro se ha modificado o no
                if (filasActualizadas > 0) {
                    System.out.println("Libro modificado exitosamente.");
                    System.out.println("");
                } else {
                    System.out.println("No se pudo modificar el libro.");
                    System.out.println("");
                }

                pstatement.close();
            }

            // Cerrar recursos
            conn.close();
        } catch (SQLException e) {
            // En el caso de que ocurra algun error,
            // se muestra un mensaje "Ha ocurrido un error"
            // y a continuacion se muestra el mensaje de error para poder identificarlo
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("");
        }
    }

    public void borrarLibros(String libroABorrar) {
        try {
            // Establecer conexión
            Connection conn = miConexion.hazConexion();
            // Crear consulta SQL para insertar el libro
            String query = "DELETE FROM publication WHERE book_title = ?";
            // Preparar la declaración SQL
            PreparedStatement pstatement = conn.prepareStatement(query);
            // Indicamos el libro que quiere borrar
            pstatement.setString(1, libroABorrar);

            // Ejecutamos la consulta
            int filasBorradas = pstatement.executeUpdate();

            // Comprobamos si se ha modificado alguna fila de la base de datos
            // lo que significaria que se ha borrado el libro sin problemas
            // y mostramos un mensaje en cualquier caso
            // indicando si el libro se ha borrado o no
            if (filasBorradas > 0) {
                System.out.println("Libro borrado exitosamente.");
                System.out.println("");
            } else {
                System.out.println("No se encontró ningún libro con ese título.");
                System.out.println("");
            }

            // Cerrar recursos
            pstatement.close();
            conn.close();
        } catch (SQLException e) {
            // En el caso de que ocurra algun error,
            // se muestra un mensaje "Ha ocurrido un error"
            // y a continuacion se muestra el mensaje de error para poder identificarlo
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("");
        }
    }

    // Metodod que uso para verificar si el libro existe en la base de datos
    public void verificarExistencia(String titulo) {
        try {
            // Establecer conexión
            Connection conn = miConexion.hazConexion();
            // Crear consulta SQL para insertar el libro
            String query = "SELECT COUNT(*) FROM publication WHERE book_title = ?";
            // Preparar la declaración SQL
            PreparedStatement pstatement = conn.prepareStatement(query);
            // Indicamos el libro que tiene que buscar
            pstatement.setString(1, titulo);
            // Ejecutamos la consulta
            ResultSet rs = pstatement.executeQuery();
            // Comprobamos si hay algun libro con el titulo introducido
            // en la base de datos
            // Si no se encuentra, se muestra un mensaje para 
            // avisar de que no se ha encontrado
            rs.next();
            int existencia = rs.getInt(1);
            this.existencia = existencia;
            if (existencia == 0) {
                System.out.println("No se encontró ningún libro con ese título.");
                System.out.println("");
            }
        } catch (SQLException e) {
            // En el caso de que ocurra algun error,
            // se muestra un mensaje "Ha ocurrido un error"
            // y a continuacion se muestra el mensaje de error para poder identificarlo
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("");
        }
    }
}
