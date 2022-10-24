/*
 * tabla_multiplicar.java
 * 
 * Copyright 2022 Mario <Mario@DESKTOP-MARIO>
 * 
 * 17/10/2022
 * 
 */
 
import java.util.Scanner;

public class tabla_multiplicar {

	public static void main(String[] args) {
		
		int numero_tabla, numero = 0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Escribe un numero entre 0 y 20");
		numero_tabla = sc.nextInt();
	
		System.out.println ("Tabla del " + numero_tabla);
		
		while (numero_tabla>20) {
			System.out.println("Numero muy grande");
			System.out.println("Escribelo otra vez");
			numero_tabla = sc.nextInt();
		}
		
		while (numero_tabla<0) {
			System.out.println("Numero muy bajo");
			System.out.println("Escribelo otra vez");
			numero_tabla = sc.nextInt();
		}
		
		while (numero<=10) {
			int producto = numero_tabla * numero;
			System.out.println (numero_tabla + "x" + numero + "=" + producto);
			numero++;
		}
		
	}

}
