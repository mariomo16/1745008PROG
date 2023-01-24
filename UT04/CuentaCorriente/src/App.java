import java.util.Scanner;

@SuppressWarnings("unused")
public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        CuentaCorriente miCuenta = new CuentaCorriente(null);
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("*******************************");
            System.out.println("*      CUENTA CORRIENTEE      *");
            System.out.println("*        MARIO MORALES        *");
            System.out.println("*******************************");
            System.out.println("");
            System.out.println("¿Que necesitas?");
            System.out.println("1: Ingresar cantidad.");
            System.out.println("2: Retirar cantidad.");
            System.out.println("3: Consultar saldo de cuenta.");
            System.out.println("4: Listar ultimos movimientos de cuenta.");
            System.out.println("0: SALIR");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuanto quieres ingresar?");
                    miCuenta.Ingresar(sc.nextInt());
                    break;

                case 2:
                    System.out.println("¿Cuanto quieres retirar?");
                    miCuenta.Retirar(sc.nextInt());
                    break;

                case 3:
                    System.out.println(miCuenta.consultarSaldo());
                    break;

                case 4:
                    System.out.println(miCuenta.listaMovimientos(opcion));
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