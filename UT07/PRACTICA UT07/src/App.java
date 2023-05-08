import java.io.*;
import java.sql.*;
import java.util.Scanner;

import controlador.Publicaciones;
import vista.Menu;

class App {
    static Scanner sc = new Scanner(System.in);

    static Publicaciones biblioteca = new Publicaciones();
    public static void main(String[] args) throws Exception {
        
        System.out.println("Iniciando aplicación...");
        
        insertar();
        
        buscarporId();
        
    }

    public static void buscarporId() {
        System.out.print("Escribe el id a buscar: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println(biblioteca.buscarPorId(id));
    }

    public static void buscarPorTitulo() {
        System.out.print("Escribe el titulo a buscar: ");
        String titulo = sc.nextLine();

        var resultado = biblioteca.buscarPorTitulo(titulo);

        if (resultado.size()>0) {
            System.out.println("Encontrados " + 
                resultado.size() + 
                " resultados:");
            for (String libro : resultado) {
                System.out.println(libro);
            }
        }
        else {
            System.out.println("No se encontró ningún resultado");
        }
    }

    public static void insertar() {
        System.out.print("Escribe el titulo a insertar: ");
        String tituloL = sc.nextLine();

        System.out.print("Escribe la fecha: ");
        String fechaL = sc.nextLine();

        System.out.print("Escribe la editorial: ");
        String editorialL = sc.nextLine();

        biblioteca.insertaLibro(tituloL, fechaL, editorialL);
    }

    public static void modificar () {
        System.out.print("Escribe el id del libro a modificar: ");
        Integer id = sc.nextInt();
        sc.nextLine();

        System.out.print("Escribe nuevo titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Escribe la fecha a modificar: ");
        String fecha = sc.nextLine();

        System.out.print("Escribe la editorial a modificar: ");
        String editorial = sc.nextLine();

        biblioteca.modificaLibro(id , titulo, fecha, editorial);
    }
}
