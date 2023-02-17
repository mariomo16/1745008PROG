import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] numeros = new double[50];

        // Rellenamos el array con números aleatorios entre 0.0 y 1.0
        for (int i = 0; i < 50; i++) {
            numeros[i] = Math.random();
        }

        // Pedimos al usuario un valor double R
        System.out.print("Introduzca un valor R: ");
        double r = sc.nextDouble();

        int contador = 0;

        // Contamos cuántos números del array son iguales o superiores a R
        for (int i = 0; i < 50; i++) {
            if (numeros[i] >= r) {
                contador++;
            }
        }

        // Mostramos el número de valores del array que son iguales o superiores a R
        System.out.println("Hay " + contador + " números iguales o superiores a " + r + " en el array.");
    }
    
}