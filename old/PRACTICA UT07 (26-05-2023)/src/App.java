import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static vista.Menu miMenu;
    static int opcion;
    static int id;
    static String titulo, anyoPublicacion, editorial;
    static String nuevoTitulo, nuevoAnyoPublicacion, nuevoEditorial;
    static Scanner in = new Scanner(System.in);

    static private controlador.Publicaciones publicaciones = new controlador.Publicaciones();

    public static void main(String[] args) throws Exception {

        creaMenu();
        do {
            miMenu.verMenu("GESTIÓN DE LIBROS");
            opcion = miMenu.leerOpcion();
            switch (opcion) {
                case 1:
                    mostrarLibros();
                    break;
                case 2:
                    buscarLibros();
                    break;
                case 3:
                    añadirLibros();
                    break;
                case 4:
                    modificarLibros();
                    break;
                case 5:
                    borrarLibros();
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
        in.close();
    }

    public static void mostrarLibros() {
        publicaciones.mostrarLibros();
    }

    public static void buscarLibros() {
        // Obtener título del libro a buscar por teclado
        System.out.println("Ingrese el título del libro:");
        titulo = in.nextLine();
        verificarExistencia(titulo);
        if (publicaciones.existencia == 1) {
            publicaciones.buscarLibros(titulo);
        }
    }

    public static void añadirLibros() {
        // Obtener detalles del libro por teclado
        System.out.println("Ingrese el título del libro:");
        titulo = in.nextLine();
        System.out.println("Ingrese la editorial del libro:");
        editorial = in.nextLine();
        System.out.println("Ingrese la fecha de publicación del libro (yyyy-DD-mm):");
        anyoPublicacion = in.nextLine();
        publicaciones.añadirLibros(titulo, editorial, anyoPublicacion);
    }

    public static void modificarLibros() {
        // Obtener título del libro a modificar por teclado
        System.out.println("Ingrese el título del libro a modificar:");
        titulo = in.nextLine();
        verificarExistencia(titulo);
        if (publicaciones.existencia == 1) {
            // Obtener nuevos detalles del libro por teclado
            System.out.println("Ingrese el nuevo título del libro:");
            nuevoTitulo = in.nextLine();
            System.out.println("Ingrese el nuevo año de publicación del libro:");
            nuevoAnyoPublicacion = in.nextLine();
            System.out.println("Ingrese la nueva editorial del libro:");
            nuevoEditorial = in.nextLine();
            publicaciones.modificarLibros(titulo, nuevoTitulo, nuevoAnyoPublicacion, nuevoEditorial);
        }
    }

    public static void borrarLibros() {
        System.out.println("Ingrese el título del libro a borrar:");
        String titulo = in.nextLine();
        publicaciones.borrarLibros(titulo);
    }

    public static void verificarExistencia(String titulo) {
        publicaciones.verificarExistencia(titulo);
    }

    private static void creaMenu() {
        var listaOpciones = new ArrayList<String>();
        listaOpciones.add("VER LISTADO LIBROS");
        listaOpciones.add("BUSCAR LIBRO");
        listaOpciones.add("AÑADIR LIBRO");
        listaOpciones.add("MODIFICAR LIBRO");
        listaOpciones.add("BORRAR LIBRO");
        miMenu = new vista.Menu(listaOpciones);
    }

}
