import java.util.Scanner;

public class tabla_multiplicar {

	public static void main (String[] args) {
		
		int numero_tabla, numero = 0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Escribe el numero de la tabla");
		numero_tabla = sc.nextInt();
	
		System.out.println ("Tabla del " + numero_tabla);
		
		while (numero<=10) {
			int producto = numero_tabla * numero;
			System.out.println (numero_tabla + "x" + numero + "=" + producto);
			numero++;
		}
	}
}
