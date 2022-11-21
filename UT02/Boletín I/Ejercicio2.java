package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numeros, mayor = 0, contador;
		Scanner sc = new Scanner(System.in);
		
		for (contador=0;contador<10;contador++) {
			System.out.println("Introduce un numero");
			numeros = sc.nextInt();
			
			if (numeros >= mayor) {
				mayor = numeros;
			}
		}
		
		System.out.println("El numero " + mayor + " es el mayor.");
	
		}

}
