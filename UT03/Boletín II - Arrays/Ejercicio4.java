import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[100];

        // Rellenamos el array con valores enteros aleatorios entre 1 y 10
        for (int i = 0; i < 100; i++) {
            valores[i] = (int) (1 + Math.random() * 10);
        }

        // Pedimos al usuario un valor N
        System.out.print("Introduzca un valor N: ");
        int n = sc.nextInt();

        // Buscamos las posiciones en las que aparece N
        System.out.print("N aparece en las posiciones: ");
        for (int i = 0; i < 100; i++) {
            if (valores[i] == n) {
                System.out.print(i + " ");
            }
        }
    }
    
}
