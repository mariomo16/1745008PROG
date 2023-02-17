import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Ingresa la primera cadena: ");
	    String cadena1 = sc.nextLine();

	    System.out.print("Ingresa la segunda cadena: ");
	    String cadena2 = sc.nextLine();

	    if (cadena1.equals(cadena2)) {
	      System.out.println("Las cadenas son iguales.");
	    } else {
	      System.out.println("Las cadenas son diferentes.");
	    }

	    if (cadena1.equalsIgnoreCase(cadena2)) {
	      System.out.println("Las cadenas son iguales sin diferenciar entre mayúsculas y minúsculas.");
	    } else {
	      System.out.println("Las cadenas son diferentes.");
	    }
	}

}