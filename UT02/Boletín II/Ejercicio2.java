package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Programa que calcula la media de los numeros positivos introducidos
        Scanner sc = new Scanner(System.in);
        int acumulador = 0, contador = 0, input, media;

        System.out.println("Introduce numeros (numero negativo para salir)");
        do {
            input = sc.nextInt();
            if (input > 0) {
                acumulador = acumulador + input;
            }
            if (input > 0) {
                contador++;
            }
        } while (input > 0);

        media = acumulador / contador;
        System.out.println("La media es " + media);

	}

}
