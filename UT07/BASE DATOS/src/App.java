import java.io.*;
import java.sql.*;

import modelo.CrearConexion;
import modelo.Publication;
import modelo.PublicationRepository;

class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Iniciando aplicación...");
        PublicationRepository repoLibros = new PublicationRepository();

        Publication libro = repoLibros.buscarPorId(1);

        if (libro != null ) {
            System.out.println("Libro encontrado");
            System.out.println(libro.toString());
        }
        else {
            System.out.println("No se encontró el libro");
        }
    }
}