import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import vista.Menu;
import controlador.Publicaciones;

class App {
    static Scanner sc = new Scanner(System.in);

    static Menu miMenu;

    static int opcion;

    static Publicaciones biblioteca = new Publicaciones();
    public static void main(String[] args) throws Exception {
        creaMenu();
        do {
            miMenu.verMenu("GESTIÓN DE LIBROS");
            opcion = miMenu.leerOpcion();
            switch (opcion) {
                case 1:
                    listar();
                    break;
                case 2:
                    buscarPorTitulo();
                    break;
                case 3:
                    insertar();
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    borrar();
                    break;
                default:
                    break;
            }
        } while (opcion!=0);
    }

    public static void listar () {
        var listado = biblioteca.obtenerListado();
        for (String linea: listado) {
            System.out.println(linea);
        }

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
        System.out.println("Escribe el titulo a insertar: ");
        String tituloL = sc.nextLine();

        System.out.print("Escribe la fecha: ");
        String fechaL = sc.nextLine();

        System.out.print("Escribe la editorial: ");
        String editorialL = sc.nextLine();

        biblioteca.insertaLibro(tituloL, fechaL, editorialL);
    }


    public static void borrar () {
        System.out.print("Escribe el id del libro a borrar: ");
        Integer id = sc.nextInt();
        sc.nextLine();

        System.out.println(biblioteca.borraLibro(id));
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

        System.out.println(biblioteca.modificaLibro(id , titulo, fecha, editorial));
    }

    private static void creaMenu() {
        var listaOpciones = new ArrayList<String>();
        listaOpciones.add("VER LISTADO LIBROS");
        listaOpciones.add("BUSCAR LIBRO");
        listaOpciones.add("AÑADIR LIBRO");
        listaOpciones.add("MODIFICAR LIBRO");
        listaOpciones.add("BORRAR LIBRO");
        miMenu = new Menu(listaOpciones);

    }
}
