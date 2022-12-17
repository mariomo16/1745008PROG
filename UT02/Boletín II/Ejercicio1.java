package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Programa que crea una zona privada, necesitas poner un codigo de 4 digitos en
        // 4 intentos
        Scanner sc = new Scanner(System.in);
        int password = 4103, oportunidades = 4;

        System.out.println("Inroduce la contraseña (debe tener 4 digitos)");
        while (oportunidades > 0) {
            int input = sc.nextInt();
            if (Integer.toString(input).length() != 4) {
                System.out.println("Debe tener 4 digitos");
            } else {
                if (input == password) {
                    System.out.println("PUEDES PASAR");
                    oportunidades = 0;
                } else {
                    if (input != password) {
                        oportunidades--;
                        System.out.println("CONTRASEÑA INCORRECTA, TE QUEDAN " + oportunidades + " OPORTUNIDADES");
                    }
                }
            }
        }

	}

}
