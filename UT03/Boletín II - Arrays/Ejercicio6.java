import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor.");
            System.out.println("c. Salir.");
            System.out.print("Introduce una opción: ");
            opcion = sc.next().charAt(0);

            switch(opcion) {
                case 'a':
                    System.out.println("\nValores del array:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Posición " + i + ": " + array[i]);
                    }
                    break;

                case 'b':
                    System.out.print("Introduce un valor entero: ");
                    int valor = sc.nextInt();
                    System.out.print("Introduce la posición donde quieres insertar el valor (0 - 9): ");
                    int posicion = sc.nextInt();

                    if (posicion < 0 || posicion > 9) {
                        System.out.println("Posición inválida. Debe ser un valor entre 0 y 9.");
                    } else {
                        array[posicion] = valor;
                        System.out.println("Valor " + valor + " insertado en la posición " + posicion + " del array.");
                    }
                    break;

                case 'c':
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción inválida. Por favor, introduce una opción correcta.");
                    break;
            }
        } while (opcion != 'c');
    }
    
}