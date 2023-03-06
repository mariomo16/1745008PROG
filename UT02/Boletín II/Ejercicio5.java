import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
        // Programa que suma los 100 numeros siguientes al numero entero y positivo
        // introducido
		Scanner scanner = new Scanner(System.in);
		int numero, suma = 0;
		
		System.out.print("Por favor, introduce un numero: ");
		numero = scanner.nextInt();
		while (numero<0) {
			System.out.println("El numero introducido debe de ser positivo");
			numero = scanner.nextInt();
		}
		
		for (int i = numero; i < numero + 100; i++) {
			suma += i;
		}
		
		System.out.println("La suma de los 100 numeros siguientes al numero introducido es: " + suma);
	}

}
