package controlador;

import java.util.ArrayList;

import modelo.Publication;
import modelo.PublicationRepository;

public class Publicaciones {

    private PublicationRepository repoLibros = new PublicationRepository();

    public String buscarPorId (Integer id) {
        Publication libro = repoLibros.buscarPorId(id);

        if (libro != null) {
            return "Libro encontrado -> \n" +
                libro.toString();
        } else {
           return "No se encontró el libro";
        }
    }

    public ArrayList<String> buscarPorTitulo(String titulo) {
        ArrayList<String> lista = new ArrayList<>();

        for (Publication libro: repoLibros.getRepositorio()) {
            if (libro.getBookTitle().contains(titulo)) {
                
                lista.add(libro.toString());
            }
        }

        return lista;
    }

    public void insertaLibro(String titulo , String fecha , String editorial) {
        int id = repoLibros.getProximoId();
        var libro = new Publication( id ,titulo, 
        fecha , editorial);
        repoLibros.insertar(libro);
        repoLibros.grabarRepositorio();
    }

    /**  public void modificaLibro( Integer id , String titulo , String fecha , String editorial) {
        var libro = new Publication( id ,titulo, 
        fecha , editorial);
        repoLibros.modificar(id, libro);
    } 
    */

        public String modificaLibro( Integer id , String titulo , String fecha , String editorial) {
        Publication libro_original = repoLibros.buscarPorId(id);

        if (libro_original != null) {
            var libro = new Publication( id ,titulo,
                    fecha , editorial);
            if (repoLibros.modificar(id, libro)) {
                return "Libro modificado -> \n" +
                        libro.toString();
            }
            else {
                return "Error al modificar";
            }

        } else {
            return "No se encontró el libro";
        }

    }

    public String borraLibro( Integer id) {
        Publication libro = repoLibros.buscarPorId(id);

        if (libro != null) {
            var res = repoLibros.borrar(id);
            if (res == null) return "Libro borrado -> \n" +  libro.toString();
            else return "Error al borrar";
        } else {
            return "No se encontró el libro";
        }

    }

    public Object obtenerListado() {
        return null;
    }
  
}
