import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce un numero menor que 100: ");
            numero = sc.nextInt();
        } while (numero >= 100);

        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("La suma de los numeros de 1 hasta " + numero + " es: " + suma);
    }

}
