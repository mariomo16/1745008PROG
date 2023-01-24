import java.util.Scanner;

@SuppressWarnings("unused")
public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        TarjetaRegalo tarjetaUno = new TarjetaRegalo(50);
        TarjetaRegalo tarjetaDos = new TarjetaRegalo(25);
        // TarjetaRegalo tarjetaNueva = tarjetaUno.combinar(tarjetaDos);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("*******************************");
            System.out.println("*       TARJETAS REGALO       *");
            System.out.println("*        MARIO MORALES        *");
            System.out.println("*******************************");
            System.out.println("");
            System.out.println("¿Que tarjeta regalo quieres usar?");
            System.out.println("1: Usar Tarjeta Regalo 1.");
            System.out.println("2: Usar Tarjeta Regalo 2.");
            System.out.println("3: Combinar tarjetas regalo.");
            System.out.println("0: SALIR");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Identificador de tarjeta regalo: " + tarjetaUno.getIdentificador(null));
                    System.out.println("¿Cuanto saldo quieres usar?");
                    
                    break;

                case 2:
                    System.out.println("Identificador de tarjeta regalo: " + tarjetaDos.getIdentificador(null));
                    System.out.println("¿Cuanto saldo quieres usar?");

                    break;

                case 3:
                    break;

                case 0:
                    System.out.println("Has seleccionado SALIR");
                    System.out.println("ADIOS");
                    break;

                default:
                    break;
            }
        } while (opcion != 0);

    }
}
