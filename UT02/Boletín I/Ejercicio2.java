import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el numero " + i + ": ");
            int numero = sc.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
        }
    }
    
}
