package main;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numero=0, suma=0, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce numeros (numero negativo para salir)");
		
		while (numero>=0) {
			numero=sc.nextInt();
			suma=suma+numero;
		}
		media=suma/2;
		System.out.println("La media de los numeros introducidos es: "+media);

	}

}
