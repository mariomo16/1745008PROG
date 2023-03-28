import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Contacto> contactos = new ArrayList<>();
    public static void main(String[] args) {

        Agenda miAgenda = new Agenda();
        miAgenda.leerAgenda();

        // Avisa si alguien de contactos cumple años hoy
        LocalDate hoy = LocalDate.now();
        for (Contacto contacto : contactos) {
            if (contacto.getFechaNacimiento().getMonth() == hoy.getMonth() &&
                    contacto.getFechaNacimiento().getDayOfMonth() == hoy.getDayOfMonth()) {
                System.out.println(contacto.getNombre() + " " + contacto.getApellidos() +
                        " cumple años hoy (" + hoy.getYear() + ").");
            }
        }

        // Menu
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear contacto");
            System.out.println("2. Modificar contacto");
            System.out.println("3. Leer contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    miAgenda.crearContacto(sc);
                    break;
                case 2:
                    miAgenda.modificarContacto(sc);
                    break;
                case 3:
                    miAgenda.leerContacto(sc);
                    break;
                case 4:
                    miAgenda.borrarContacto(sc);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

    }
}
