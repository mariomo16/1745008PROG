package boletin2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	    // Programa que muestra los numeros enteros comprendidos entre dos numeros
        // introducidos por teclado
        Scanner sc = new Scanner(System.in);
		int numero1, numero2, mayor, menor, i;

		do {
			System.out.println("Introduce un numero positivo");
			numero1 = sc.nextInt();
		} while (numero1 < 0);
		do {
			System.out.println("Introduce un numero positivo (distinto al primer numero introducido)");
			numero2 = sc.nextInt();
		} while (numero2 < 0 && numero2 != numero1);

		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		} else {
			mayor = numero2;
			menor = numero1;
		}
		
		i = menor;
		while (i < mayor + 1) {
			System.out.println(i);
			i++;
		}
	}

}
