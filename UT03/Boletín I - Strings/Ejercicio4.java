import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
	    String nombre = sc.nextLine();

	    System.out.print("Ingresa tu primer apellido: ");
	    String apellido1 = sc.nextLine();

	    System.out.print("Ingresa tu segundo apellido: ");
	    String apellido2 = sc.nextLine();

	    String nombreAbreviado = nombre.substring(0, 3);
	    String apellido1Abreviado = apellido1.substring(0, 3);
	    String apellido2Abreviado = apellido2.substring(0, 3);
	    
	    String codigoUsuario = nombreAbreviado + apellido1Abreviado + apellido2Abreviado;
	    
	    System.out.println("Tu código de usuario es: " + codigoUsuario.toUpperCase());
	}

}