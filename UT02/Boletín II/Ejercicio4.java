package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Programa que comprueba si el numero positivo introducido es primo
		Scanner sc = new Scanner(System.in);
		int numero, primo=1;

		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		while (numero < 0) {
			System.out.println("El numero debe de ser positivo");
			numero=sc.nextInt();
		}

		if (numero == 0 || numero == 1 || numero == 4) {
			primo=0;
		}

		for (int i = 2; i < numero / 2; i++) {
			if (numero % i == 0) {
				primo=0;
			}
		}
		
		if (primo==1) {
			System.out.println("El numero introducido es primo");
		} else {
			System.out.println("El numero introducido no es primo");
		}
	}

}
