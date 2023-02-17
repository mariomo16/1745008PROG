import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];

        // Leer 15 números desde el teclado y guardarlos en el array
        for (int i = 0; i < 15; i++) {
            System.out.print("Introduzca el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Rotar los elementos del array
        int ultimo = numeros[14];
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i-1];
        }
        numeros[0] = ultimo;

        // Mostrar el contenido del array
        System.out.print("Array rotado: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}