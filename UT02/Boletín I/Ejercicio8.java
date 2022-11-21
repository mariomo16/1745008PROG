package main;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int nota=0;
		boolean diez;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce secuencia de notas entre 1-10");
		do {
			nota=sc.nextInt();
			if (nota==10) {
				diez=true;
			}
		} while (nota!=-1);
		if (diez=true) {
			System.out.println("Ha habido 1 o mas notas con valor 10");
		}
		if (diez=false) {
			System.out.println("No ha habido ninguna nota con valor 10");
		}
	}

}
