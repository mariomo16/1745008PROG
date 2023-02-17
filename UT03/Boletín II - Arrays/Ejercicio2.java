import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedimos los dos números por teclado
        System.out.print("Introduzca el valor de N: ");
        int n = sc.nextInt();
        System.out.print("Introduzca el valor de M: ");
        int m = sc.nextInt();

        int[] numeros = new int[n];
        int cantidad = 0;

        // Pedimos los números por teclado y solo guardamos aquellos que sean múltiplos de M
        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el número " + (i+1) + ": ");
            int num = sc.nextInt();
            if (num % m == 0) {
                numeros[cantidad] = num;
                cantidad++;
            }
        }

        // Mostramos el contenido del array
        System.out.print("Array de múltiplos de " + m + ": ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
    
}