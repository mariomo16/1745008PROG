package controlador;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import modelo.Persona;

public class Agenda {

    Persona contacto = new Persona(null, null, null, null, null);
    Scanner in = new Scanner (System.in);

    public Agenda() {

    }

    public void crearContacto() {
        try {
            // Pedir al usuario los datos del nuevo contacto
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduzca el nombre del nuevo contacto: ");
            contacto.setNombre(reader.readLine());
            System.out.print("Introduzca los apellidos del nuevo contacto: ");
            contacto.setApellidos(reader.readLine());
            System.out.print("Introduzca el teléfono del nuevo contacto: ");
            contacto.setTelefono(reader.readLine());
            System.out.print("Introduzca el correo electrónico del nuevo contacto: ");
            contacto.setCorreo(reader.readLine());
            System.out.println("Introduzca la fecha de nacimiento del nuevo contacto (dd-MM-yyyy)");
            contacto.setFechaNacimiento(reader.readLine());

            // Abrir el archivo de agenda en modo escritura y escribir la nueva línea con los datos del contacto al final del archivo
            File agenda = new File("agenda.txt");
            BufferedWriter escritor = new BufferedWriter(new FileWriter(agenda, true));
            escritor.write(
                contacto.getNombre() + ";" + 
                contacto.getApellidos() + ";" + 
                contacto.getTelefono() + ";" + 
                contacto.getCorreo() + ";" + 
                contacto.getFechaNacimiento() + "\n");

            // Cerrar el archivo
            escritor.close();

            System.out.println("El contacto ha sido agregado exitosamente.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    // Distinge mayusculas de minusculas al escribir el nombre del contacto a modificar
    public void modificarContacto() {
        try {
            // Pedir al usuario el nombre del contacto que desea modificar
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduzca el nombre del contacto que desea modificar: ");
            String nombreAModificar = reader.readLine();

            // Abrir el archivo de agenda en modo lectura y el archivo temporal en modo escritura
            File agenda = new File("agenda.txt");
            File temporal = new File("temporal.txt");
            BufferedReader lector = new BufferedReader(new FileReader(agenda));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(temporal));

            // Leer cada línea del archivo de agenda y escribir todas las líneas en el archivo temporal, pero modificando la línea correspondiente al contacto que se desea modificar
            String lineaActual;
            while ((lineaActual = lector.readLine()) != null) {
                String[] datos = lineaActual.split(";");
                if (datos[0].equals(nombreAModificar)) {
                    System.out.println("Introduzca el nuevo nombre del contacto (en blanco si no desea modificar):");
                    String nuevoNombre = reader.readLine();
                    if (nuevoNombre.equals("")) {
                        nuevoNombre = datos[0];
                    }
                    System.out.println("Introduzca los nuevos apellidos del cotacto (en blanco si no desea modificar):");
                    String nuevoApellidos = reader.readLine();
                    if (nuevoApellidos.equals("")) {
                        nuevoApellidos = datos[1];
                    }
                    System.out.print("Introduzca el nuevo teléfono del contacto (en blanco si no desea modificar): ");    
                    String nuevoTelefono = reader.readLine();
                    if (nuevoTelefono.equals("")) {
                        nuevoTelefono = datos[2];
                    }
                    System.out.print("Introduzca el nuevo correo electrónico del contacto (en blanco si no desea modificar): ");
                    String nuevoCorreo = reader.readLine();
                    if (nuevoCorreo.equals("")) {
                        nuevoCorreo = datos[3];
                    }
                    System.out.print("Introduzca la nueva fecha de nacimiento del contacto (en blanco si no desea modificar): ");
                    String nuevoFechaNacimiento = reader.readLine();
                    if (nuevoFechaNacimiento.equals("")) {
                        nuevoFechaNacimiento = datos[4];
                    }
                    escritor.write(datos[0] + ";" + nuevoApellidos + ";" +nuevoTelefono + ";" + nuevoCorreo + ";" + nuevoFechaNacimiento +"\n");
                } else {
                    escritor.write(lineaActual + "\n");
                }
            }

            // Cerrar ambos archivos
            lector.close();
            escritor.close();

            // Borrar el archivo original
            agenda.delete();

            // Renombrar el archivo temporal con el nombre del archivo original
            temporal.renameTo(agenda);

            System.out.println("El contacto ha sido modificado exitosamente.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public void leerContactos() {
        try {
            // Abrir el archivo de agenda en modo lectura
            System.out.println();
            File agenda = new File("agenda.txt");
            BufferedReader lector = new BufferedReader(new FileReader(agenda));

            // Leer cada línea del archivo y mostrar los datos del contacto correspondiente en la consola
            String lineaActual;
            while ((lineaActual = lector.readLine()) != null) {
                String[] datos = lineaActual.split(";");
                System.out.println("Nombre: " + datos[0]);
                System.out.println("Apellidos: " + datos[1]);
                System.out.println("Teléfono: " + datos[2]);
                System.out.println("Correo electrónico: " + datos[3]);
                System.out.println("Nacimiento: " + datos[4]);
                System.out.println();
            }

            // Cerrar el archivo
            lector.close();

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public void buscarContacto() {
        try {
            // Abrir el archivo de agenda en modo lectura
            BufferedReader lector = new BufferedReader(new FileReader("agenda.txt"));

            // Pedir el nombre del contacto a buscar
            System.out.println("Introduce el nombre del contacto:");
            String nombreBuscado = System.console().readLine();

            // Buscar el contacto en el archivo de agenda
            String lineaActual;
            boolean encontrado = false;
            while ((lineaActual = lector.readLine()) != null) {
                String[] datos = lineaActual.split(";");
                if (datos[0].equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("Contacto encontrado:");
                    System.out.println("");
                    System.out.println("Nombre: " + datos[0]);
                    System.out.println("Apellidos: " + datos[1]);
                    System.out.println("Teléfono: " + datos[2]);
                    System.out.println("Correo electrónico: " + datos[3]);
                    System.out.println("Fecha de nacimiento: " + datos[4]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Contacto no encontrado.");
            }

            // Cerrar el archivo de agenda
            lector.close();

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    // Distinge mayusculas de minusculas al escribir el nombre del contacto a borrar
    public void borrarContacto() {
        try {
            // Pedir al usuario el nombre del contacto que desea borrar
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduzca el nombre del contacto que desea borrar: ");
            String nombreABorrar = reader.readLine();

            // Abrir el archivo de agenda en modo lectura y el archivo temporal en modo escritura
            File agenda = new File("agenda.txt");
            File temporal = new File("temporal.txt");
            BufferedReader lector = new BufferedReader(new FileReader(agenda));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(temporal));

            // Leer cada línea del archivo de agenda y escribir todas las líneas en el archivo temporal, excepto la línea correspondiente al contacto que se desea borrar
            String lineaActual;
            while ((lineaActual = lector.readLine()) != null) {
                String[] datos = lineaActual.split(";");
                if (!datos[0].equals(nombreABorrar)) {
                    escritor.write(lineaActual + "\n");
                }
            }

            // Cerrar ambos archivos
            lector.close();
            escritor.close();

            // Borrar el archivo original
            agenda.delete();

            // Renombrar el archivo temporal con el nombre del archivo original
            temporal.renameTo(agenda);

            System.out.println("El contacto ha sido borrado exitosamente.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public void comprobarNacimiento() {
        try {
            // Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fechaActualStr = fechaActual.format(formatter);

            // Abrir el archivo de agenda en modo lectura
            BufferedReader lector = new BufferedReader(new FileReader("agenda.txt"));

            // Leer cada línea del archivo de agenda y comprobar si el cumpleaños del contacto corresponde a la fecha actual
            String lineaActual;
            while ((lineaActual = lector.readLine()) != null) {
                String[] datos = lineaActual.split(";");
                LocalDate fechaNacimiento = LocalDate.parse(datos[4], formatter);
                if (fechaNacimiento.getMonthValue() == fechaActual.getMonthValue() && fechaNacimiento.getDayOfMonth() == fechaActual.getDayOfMonth()) {
                    System.out.println("Hoy es el cumpleaños de " + datos[0] + " " + datos[1] + "!");
                    System.out.println("Teléfono: " + datos[2]);
                    System.out.println("Correo electrónico: " + datos[3]);
                    System.out.println("");
                }
            }

            // Cerrar el archivo de agenda
            lector.close();

            // Hago que el usuario pulse un boton antes de entrar en el menu, para que en el caso de que
            // alguien cumpla años, pueda ver quien y su informacion antes de llevarle al menu
            System.out.println("");
            System.out.println("Pulsa ENTER para continuar");
            in.nextLine();

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

}
