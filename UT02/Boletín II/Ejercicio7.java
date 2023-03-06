import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Programa que cuenta cuantos numeros hemos introducido, la media de los
		// impares, y el mayor de los pares
		Scanner sc = new Scanner(System.in);
	    int contador = 0;
	    double sumaImpares = 0;
	    int contadorImpares = 0;
	    int mayorPar = Integer.MIN_VALUE;

	    while (true) {
	    	System.out.print("Introduce un numero: ");
	    	int numero = sc.nextInt();

	    	if (numero < 0) {
	    		break;
	    	}

	    	contador++;

	    	if (numero % 2 == 0) {
	    		mayorPar = Math.max(mayorPar, numero);
	    	} else {
	   			sumaImpares += numero;
	    		contadorImpares++;
	    	}
	    }

	    System.out.println("Se han introducido " + contador + " numeros");
	    if (contadorImpares > 0) {
	    	System.out.println("La media de los impares es " + (sumaImpares / contadorImpares));
	    } else {
	    	System.out.println("No se han introducido impares");
	    }
	    if (mayorPar == Integer.MIN_VALUE) {
	    	System.out.println("No se han introducido pares");
	    } else {
	    	System.out.println("El mayor numero par es " + mayorPar);
	    }
	}

}
