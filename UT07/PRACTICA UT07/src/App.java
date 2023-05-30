/*
 * Mario Morales Ortega (1745008)
 * 3PAW - UT07 - PRACTICA JDBC
 * 
 *  -- Hay algunos comentarios que pongo para ubicarme y saber donde estoy. (EJ: // TITULO, // AÑO PUBLICACION, // EDITORIAL)
 * 
 *  -- Algunos System.out.println(""); los uso para dejar un espacio despues de introducir u obtener algo y que se lea mejor.
 * 
 *  -- En el metodo modificarLibro(), si no se introducen valores nuevos en algun dato, se quedara como estaba.
 * 
 *  -- Al introducir valores incorrectos (o cualquier cosa que provoque un error, 
 *     se muestra un mensaje en pantalla "Ha ocurrido un error: ", seguido de el mensaje de error para poder identificarlo").
 * 
 *     -- Ejemplo al introducir valores incorrectos en el formato de la fecha de publicacion:
 *        "Ha ocurrido un error: Data truncation: Incorrect date value: '202-1230' for column 'publish_date' at row 1"
 * 
 *     -- En el metodo modificarLibro(), por ejemplo, prefiero poner que al dar error, salga un mensaje asi, indicando que ha habido un error,
 *        seguido de una linea indicando que error ha dado, por si acaso el error que salta no es el del formato de fecha incorrecto.
 *        No se si lo querias asi, o preferias que salga directamente algo parecido a "FORMATO DE FECHA INCORRECTO" (en este caso concreto).
 * 
 *  -- En principio, el unico error que me ha llegado a salir ha sido al introducir valores incorrectos en el formato de la fecha de publicacion,
 *     pero la app sigue funcionando sin problema, y solamente se muestra una unica linea indicando el error (para poder identificarlo).
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static vista.Menu miMenu;
    static int opcion;
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
        // Llamo al metodo para verificar si el libro existe, y si es asi
        // se llama al metodo buscarLibros() con el titulo del libro que tiene q buscar
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
        System.out.println("Ingrese la fecha de publicación del libro (yyyy-MM-dd):");
        anyoPublicacion = in.nextLine();
        // Llamo al metodo añadirLibro() pasandole los datos introducidos anteriormente
        publicaciones.añadirLibros(titulo, editorial, anyoPublicacion);
    }

    public static void modificarLibros() {
        // Obtener título del libro a modificar por teclado
        System.out.println("Ingrese el título del libro a modificar:");
        titulo = in.nextLine();
        // Llamo al metodo para verificar si el libro existe, 
        // y existe, se le pediran los nuevos datos del libro
        // para pasarselos luego al metodo modificarLibro()
        verificarExistencia(titulo);
        if (publicaciones.existencia == 1) {
            // Obtener nuevos detalles del libro por teclado
            System.out.println("Ingrese el nuevo título del libro:");
            nuevoTitulo = in.nextLine();
            System.out.println("Ingrese la nueva fecha de publicación del libro (yyyy-MM-dd):");
            nuevoAnyoPublicacion = in.nextLine();
            System.out.println("Ingrese la nueva editorial del libro:");
            nuevoEditorial = in.nextLine();
            // Llamo al metodo modificarLibro() pasandole los datos introducidos anteriormente
            publicaciones.modificarLibros(titulo, nuevoTitulo, nuevoAnyoPublicacion, nuevoEditorial);
        }
    }

    public static void borrarLibros() {
        // Obtener el titulo del libro que quiere borrar
        System.out.println("Ingrese el título del libro a borrar:");
        String titulo = in.nextLine();
        // Llamo al metodo borrarLibro() pasandole el titulo del libro que tiene que borrar
        publicaciones.borrarLibros(titulo);
    }

    public static void verificarExistencia(String titulo) {
        // Llamo al metodo verificarExistencia(), 
        // pasandole el titulo del libro
        // para comprobar si el libro existe o no
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
