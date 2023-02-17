import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creamos el array de enteros
        int[] array = new int[1000];
        
        // Rellenamos el array con valores enteros aleatorios entre 0 y 99
        for (int i = 0; i < 1000; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        
        // Pedimos al usuario que introduzca el valor a buscar
        System.out.print("Introduce un valor entero entre 0 y 99: ");
        int valorBuscado = sc.nextInt();
        
        // Utilizamos el método binarySearch de la clase Arrays para buscar el valor
        int indice = Arrays.binarySearch(array, valorBuscado);
        int contador = 0;
        if (indice >= 0) {
            // El valor ha sido encontrado al menos una vez
            contador++;
            
            // Buscamos si hay más repeticiones del valor
            for (int i = indice + 1; i < 1000 && array[i] == valorBuscado; i++) {
                contador++;
            }
            for (int i = indice - 1; i >= 0 && array[i] == valorBuscado; i--) {
                contador++;
            }
            
            // Mostramos por pantalla el resultado
            System.out.println("El valor " + valorBuscado + " aparece en el array en la posición " + indice + " y se repite " + contador + " veces.");
        } else {
            // El valor no ha sido encontrado en el array
            System.out.println("El valor " + valorBuscado + " no aparece en el array.");
        }
    }
    
}