import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce una cadena de texto: ");
	    String cadena = sc.nextLine();

	    String[] palabras = cadena.split(" ");

	    for (String palabra : palabras) {
	    	System.out.println(palabra);
	    }
	}

}
