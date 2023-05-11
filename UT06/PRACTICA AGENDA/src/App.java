import java.io.*;
import java.util.Scanner;

import controlador.Agenda;

public class App {
    public static void main(String[] args) throws Exception {

        // Creamos el fichero agenda.txt en caso de que no exista
        File Agenda = new File("Agenda.txt");

        controlador.Agenda agenda = new Agenda();
        agenda.leerContactos();

        Scanner in = new Scanner(System.in);
        int eleccion;

        // Menu
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("ELIGA QUE QUIERE HACER EN LA AGENDA");
            System.out.println("");
            System.out.println("");
            System.out.println("1 -> Crear contacto");
            System.out.println("2 -> Modificar contacto");
            System.out.println("3 -> Ver contactos");
            System.out.println("4 -> Borrar contacto");
            System.out.println("0 -> Salir");

            switch (eleccion = in.nextInt()) {
                case 1:
                    agenda.crearContacto();
                    break;

                case 2:
                    agenda.modificarContacto(null);
                    break;

                case 3:
                    agenda.leerContactos();
                    break;

                case 4:
                    agenda.borrarContacto();
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (eleccion != 0);
    }
}
