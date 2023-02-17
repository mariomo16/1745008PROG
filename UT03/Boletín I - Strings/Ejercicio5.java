package boletinStrings;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingresa una frase: ");
		String frase = sc.nextLine();
		
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;

		for (int i = 0; i < frase.length(); i++) {
		  char caracter = frase.toLowerCase().charAt(i);
		  if (caracter == 'a') {
		    contadorA++;
		  } else if (caracter == 'e') {
		    contadorE++;
		  } else if (caracter == 'i') {
		    contadorI++;
		  } else if (caracter == 'o') {
		    contadorO++;
		  } else if (caracter == 'u') {
		    contadorU++;
		  }
		}
		
		System.out.println("En la frase hay:");
		System.out.println(contadorA + " vocales 'a'");
		System.out.println(contadorE + " vocales 'e'");
		System.out.println(contadorI + " vocales 'i'");
		System.out.println(contadorO + " vocales 'o'");
		System.out.println(contadorU + " vocales 'u'");
	}

}
