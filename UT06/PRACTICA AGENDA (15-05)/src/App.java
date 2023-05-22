/*
 * Mario Morales Ortega
 * PRACTICA AGENDA
 * 3PAW
 * 
 * Los metodos modificar, y borrar, actuan sobre un archivo temporal (temporal.txt)
 * para poder borrar la linea del contacto antiguo.
 * 
 * Rellena el fichero temporal con todos los contactos que no se van a modificar
 * y luego añade el contacto ya modificado, borra el archivo agenda.txt, 
 * y renombra el archivo temporal.txt -> agenda.txt
 * 
 * Correccion 15-05: Ahora Agenda pide todos los datos en vez de cabiarlos 
 * directamente en el metodo ageda.nombreMetodo
 * 
 */

import java.util.Scanner;
import java.io.*;

import controlador.Agenda;

public class App {
    public static void main(String[] args) throws Exception {

        controlador.Agenda agenda = new Agenda();

        Scanner in = new Scanner(System.in);
        int eleccion;

        // Menu
        try {
            agenda.comprobarNacimiento();
            do {
                System.out.println("");
                System.out.println("");
                System.out.println("ELIGA QUE QUIERE HACER EN LA AGENDA");
                System.out.println("");
                System.out.println("1 -> Crear contacto");
                System.out.println("2 -> Modificar contacto");
                System.out.println("3 -> Ver contactos");
                System.out.println("4 -> Buscar contacto");
                System.out.println("5 -> Borrar contacto");
                System.out.println("0 -> Salir");

                switch (eleccion = in.nextInt()) {
                    case 1:
                        // Pedir al usuario los datos del nuevo contacto
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        System.out.print("Introduzca el nombre del nuevo contacto: ");
                        agenda.aNombre = (reader.readLine());
                        System.out.print("Introduzca los apellidos del nuevo contacto: ");
                        agenda.aApellidos = (reader.readLine());
                        System.out.print("Introduzca el teléfono del nuevo contacto: ");
                        agenda.aTelefono = (reader.readLine());
                        System.out.print("Introduzca el correo electrónico del nuevo contacto: ");
                        agenda.aCorreo = (reader.readLine());
                        System.out.println("Introduzca la fecha de nacimiento del nuevo contacto (dd-MM-yyyy): ");
                        agenda.aFechaNacimiento = (reader.readLine());
                        agenda.crearContacto();
                        break;

                    case 2:
                        // Pedir al usuario el nombre del contacto que desea modificar
                        // nombro el BufferedReader como reader2 ya que al ya haber un reader arriba, da
                        // conflicto
                        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                        System.out.print("Introduzca el nombre del contacto que desea modificar: ");
                        agenda.nombreAModificar = reader2.readLine();
                        agenda.modificarContacto();
                        break;

                    case 3:
                        agenda.leerContactos();
                        break;

                    case 4:
                        // Pedir el nombre del contacto a buscar
                        System.out.println("Introduce el nombre del contacto:");
                        agenda.nombreBuscado = System.console().readLine();
                        agenda.buscarContacto();
                        break;

                    case 5:
                        // Pedir al usuario el nombre del contacto que desea borrar
                        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
                        System.out.print("Introduzca el nombre del contacto que desea borrar: ");
                        agenda.nombreABorrar = reader3.readLine();
                        agenda.borrarContacto();
                        break;

                    default:
                        break;
                }

                if (eleccion < 0 || eleccion > 5) {
                    System.out.println("Opcion incorrecta, introduzca un valor valido.");
                }
            } while (eleccion != 0);
            in.close();
        } catch (Exception e/* inputMismatchException */) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        in.close();
    }

}
