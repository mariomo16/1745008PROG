import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        long num = input.nextLong();

        int sumaPares = 0;
        StringBuilder digitosPares = new StringBuilder();

        while (num > 0) {
            int digito = (int) (num % 10);

            if (digito % 2 == 0) {
                digitosPares.insert(0, digito + " ");
                sumaPares += digito;
            }

            num /= 10;
        }

        if (digitosPares.length() > 0) {
            System.out.println("Los dígitos pares son: " + digitosPares);
            System.out.println("La suma de los dígitos pares es: " + sumaPares);
        } else {
            System.out.println("No se encontraron dígitos pares.");
        }
    }
    
}
