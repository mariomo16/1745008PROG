import java.util.Scanner;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        TarjetaRegalo tarjetaUno = new TarjetaRegalo(50);
        TarjetaRegalo tarjetaDos = new TarjetaRegalo(25);

        Scanner sc = new Scanner(System.in);
        int opcion, cantidad;

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
                    System.out.println("Identificador de tarjeta regalo: " + tarjetaUno.getIdentificador());
                    System.out.println("¿Cuanto saldo quieres usar?");
                    cantidad = sc.nextInt();
                    if (tarjetaUno.gastarSaldo(cantidad)) {
                        System.out.println("Se ha gastado " + cantidad + "euros, le quedan: " + tarjetaUno.getSaldo() + "euros");
                    } else {
                        System.out.println("El saldo debe ser menor o igual a " + tarjetaUno.getSaldo() + "euros");
                    }
                    break;

                case 2:
                    System.out.println("Identificador de tarjeta regalo: " + tarjetaDos.getIdentificador());
                    System.out.println("¿Cuanto saldo quieres usar?");
                    cantidad = sc.nextInt();
                    if (tarjetaDos.gastarSaldo(cantidad)) {
                        System.out.println("Se ha gastado " + cantidad + "euros, le quedan: " + tarjetaDos.getSaldo() + "euros");
                    } else {
                        System.out.println("El saldo debe ser menor o igual a " + tarjetaDos.getSaldo() + "euros");
                    }
                    break;

                case 3:
                    TarjetaRegalo combinarTarjetas = new TarjetaRegalo(tarjetaUno.getSaldo(), tarjetaDos.getSaldo());
                    tarjetaUno.setSaldo(0);
                    tarjetaDos.setSaldo(0);
                    System.out.println("Las tarjetas 1 y 2 se han quedado en saldo 0");
                    System.out.println("La nueva tarjeta combinada tiene " + combinarTarjetas.getSaldo() + "euros");
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
