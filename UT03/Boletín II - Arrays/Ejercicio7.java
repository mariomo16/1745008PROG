import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creamos los dos arrays de enteros
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        
        // Pedimos al usuario que introduzca los 20 valores
        System.out.println("Introduce 20 valores enteros:");
        for (int i = 0; i < 20; i++) {
            int valor = sc.nextInt();
            if (i < 10) {
                // Introducimos los 10 primeros valores en el primer array
                array1[i] = valor;
            } else {
                // Introducimos los 10 últimos valores en el segundo array
                array2[i - 10] = valor;
            }
        }
        
        // Comparamos los dos arrays utilizando el método equals de la clase Arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("Los dos arrays son iguales");
        } else {
            System.out.println("Los dos arrays son distintos");
        }
    }
    
}
