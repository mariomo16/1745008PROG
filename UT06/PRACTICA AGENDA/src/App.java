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
 */


import java.util.Scanner;

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
                        agenda.crearContacto();
                        break;
    
                    case 2:
                        agenda.modificarContacto();
                        break;
    
                    case 3:
                        agenda.leerContactos();
                        break;
    
                    case 4:
                        agenda.buscarContacto();
                        break;

                    case 5:
                        agenda.borrarContacto();
                        break;
    
                    default:
                        break;
                }

                if (eleccion > 5 || eleccion < 0) {
                    System.out.println("Opcion incorrecta, introduzca un valor valido.");
                }
            } while (eleccion != 0);
        } catch (Exception e/*inputMismatchException*/) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

}
