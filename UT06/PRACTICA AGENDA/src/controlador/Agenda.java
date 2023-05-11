package controlador;

import java.io.*;

import modelo.Persona;

public class Agenda {

    Persona contacto = new Persona(null, null, null, null, null);

    public Agenda() {

    }

    public void crearContacto() {
        try {
            // Pedir al usuario los datos del nuevo contacto
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduzca el nombre del nuevo contacto: ");
            String nombre = reader.readLine();
            System.out.print("Introduzca los apellidos del nuevo contacto: ");
            String apellidos = reader.readLine();
            System.out.print("Introduzca el teléfono del nuevo contacto: ");
            String telefono = reader.readLine();
            System.out.print("Introduzca el correo electrónico del nuevo contacto: ");
            String correo = reader.readLine();
            System.out.println("Introduzca la fecha de nacimiento del nuevo contacto");
            String fechaNacimiento = reader.readLine();

            // Abrir el archivo de agenda en modo escritura y escribir la nueva línea con los datos del contacto al final del archivo
            File agenda = new File("agenda.txt");
            BufferedWriter escritor = new BufferedWriter(new FileWriter(agenda, true));
            escritor.write(nombre + ";" + apellidos + ";" + telefono + ";" + correo + ";" + fechaNacimiento + "\n");

            // Cerrar el archivo
            escritor.close();

            System.out.println("El contacto ha sido agregado exitosamente.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    // Distinge mayusculas de minusculas al escribir el nombre del contacto a modificar
    public void modificarContacto(Persona contactoModificado) {
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
                    System.out.print("Introduzca el nuevo nombre del contacto: ");
                    String nuevoNombre = reader.readLine();
                    System.out.print("Introduzca los nuevos apellidos del contacto: ");
                    String nuevoApellidos = reader.readLine();
                    System.out.print("Introduzca el nuevo teléfono del contacto: ");
                    String nuevoTelefono = reader.readLine();
                    System.out.print("Introduzca el nuevo correo electrónico del contacto: ");
                    String nuevoCorreo = reader.readLine();
                    System.out.print("Introduzca la nueva fecha de nacimiento del contacto: ");
                    String nuevoFechaNacimiento = reader.readLine();
                    escritor.write(nuevoNombre + ";" + nuevoApellidos + ";" + nuevoTelefono + ";" + nuevoCorreo + nuevoFechaNacimiento + "\n");
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
            File agenda = new File("agenda.txt");
            BufferedReader lector = new BufferedReader(new FileReader(agenda));

            // Leer cada línea del archivo y mostrar los datos del contacto correspondiente en la consola
            String lineaActual;
            while ((lineaActual = lector.readLine()) != null) {
                String[] datos = lineaActual.split(";");
                System.out.println("Nombre: " + datos[0]);
                System.out.println("Apellidos: + datos[1]");
                System.out.println("Teléfono: " + datos[2]);
                System.out.println("Correo electrónico: " + datos[3]);
                System.out.println("Nacimiento" + datos[4]);
                System.out.println();
            }

            // Cerrar el archivo
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

}
