package main;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int numero, contador, sumapar=0, sumaimpar=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros");
		
		for (contador=1;contador<11;contador++) {
			numero=sc.nextInt();
			if (numero%2==0) {
				if (numero>=100 && numero<=200) {
					sumapar=sumapar+numero;
				}
			}
			if (numero%2!=0) {
				if (numero>=100 && numero<=200) {
					sumaimpar=sumaimpar+numero;
				}
			}
		}
		
		System.out.println("Resultado suma par: "+sumapar);
		System.out.println("Resultado suma impar: "+sumaimpar);

	}

}
