import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private static ArrayList<Contacto> contactos = new ArrayList<>();

    public void leerAgenda() {
    }

    private void escribirAgenda() {
    }

    public void crearContacto(Scanner sc) {
        System.out.println("Introduzca el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduzca los apellidos:");
        String apellidos = sc.nextLine();

        System.out.println("Introduzca el número de teléfono:");
        String telefono = sc.nextLine();

        System.out.println("Introduzca el email:");
        String email = sc.nextLine();

        System.out.println("Introduzca la fecha de nacimiento (formato: YYYY-MM-DD):");
        LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());

        Contacto contacto = new Contacto(nombre, apellidos, telefono, email, fechaNacimiento);
        contactos.add(contacto);
        escribirAgenda();
    }

    public void modificarContacto(Scanner sc) {
        System.out.println("Introduzca el nombre del contacto que desea modificar:");
        String nombre = sc.nextLine();

        Contacto contacto = buscarContacto(nombre);
        if (contacto == null) {
            System.out.println("Contacto no encontrado.");
        } else {
            System.out.println("Introduzca los nuevos datos:");

            System.out.println("Introduzca el nombre (" + contacto.getNombre() + "):");
            String nuevoNombre = sc.nextLine();

            System.out.println("Introduzca los apellidos (" + contacto.getApellidos() + "):");
            String nuevosApellidos = sc.nextLine();

            System.out.println("Introduzca el número de teléfono (" + contacto.getTelefono() + "):");
            String nuevoTelefono = sc.nextLine();

            System.out.println("Introduzca el email (" + contacto.getEmail() + "):");
            String nuevoEmail = sc.nextLine();

            System.out.println("Introduzca la fecha de nacimiento (formato: YYYY-MM-DD) (" + contacto.getFechaNacimiento() + "):");
            LocalDate nuevaFecha = LocalDate.parse(sc.nextLine());
        }
    }

    private Contacto buscarContacto(String nombre) {
        return null;
    }

    public void leerContacto(Scanner sc) {
    }

    public void borrarContacto(Scanner sc) {
    }
    
}
