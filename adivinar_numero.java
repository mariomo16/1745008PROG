/*
 * adivinar_numero.java
 * 
 * Copyright 2022 Mario <Mario@DESKTOP-MARIO>
 * 
 * 24/10/2022
 * 
 */

import java.util.Scanner;

public class adivinar_numero {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int numero_elegido=37 , numero_leido=0, intentos=1;
		
		System.out.println("Escribe un numero entre 0 y 50");
		numero_leido = sc.nextInt();
		
		while (numero_leido<0 || numero_leido>50) {
			System.out.println("Escribe un numero dentro del rango (0 y 50)");
			numero_leido = sc.nextInt();
		}
		
		while (numero_elegido<numero_leido) {
			System.out.println("Prueba un número menor");
			intentos++;
			System.out.println("Escribelo otra vez");
			numero_leido = sc.nextInt();
		}
		
		while (numero_elegido>numero_leido) {
			System.out.println("Prueba un número mayor");
			intentos++;
			System.out.println("Escribelo otra vez");
			numero_leido = sc.nextInt();
		}
		
		System.out.println("¡El numero correcto es " + numero_elegido+ "! ", has tenido " + intentos + " intentos");
		
	}
}

