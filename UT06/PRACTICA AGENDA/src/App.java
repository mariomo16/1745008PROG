/*
 * Mario Morales Ortega (1745008)
 * 3PAW - UT06 - PRACTICA AGENDA
 * 
 * // Los metodos que necesiten escribir en el archivo agenda.txt, trabajaran sobre un archivo temporal;
 * // El metodo creara temporal.txt, escribira todos los datos de agenda.txt ahi, 
 * // cambiando la linea que se haya agregado/modificado, y al terminar,
 * // borra agenda.txt y renombra temporal.txt -> agenda.txt
 * 
 * // Al ejecutar la app, se comprueba si alguien cumple años, y si es asi, hace que el usuario
 * // tenga que pultar la tecla ENTER para proceder con el menu, por si acaso le interesa ver 
 * // los datos de la persona que cumple años antes de ir al menu. (dd/MM/yyyy)
 * 
 * Correccion 15-05: 
 *      ? Ahora Agenda pide todos los datos en vez de cabiarlos directamente en el metodo ageda.nombreMetodo
 * 
 * Correccion 26-05: 
 *      - El metodo modificarContacto ya no deberia de dar error al modificar mal un contacto.
 *      - El metodo modificarContacto ya no distingue de mayusculas y minusculas.
 *      - Ahora si al crear un contacto no se le asigna fecha de nacimiento,
 *        se le ponda 01-01-0001 de forma automatica para que no de error al ejecutar la aplicacion.
 *      - El metodo comprobarCumpleaños solo hace que el usuario pulse ENTER si alguien
 *        de la agenda cumple años.
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
                        if (agenda.aFechaNacimiento.equals("")) {
                            agenda.aFechaNacimiento = "01-01-0001";
                        }
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
