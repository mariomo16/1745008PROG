import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Programa que muestra por pantalla todas las potencias con base el numero dado y exponentes entre uno
        // y el exponente introducido, y las calcula
        Scanner sc = new Scanner(System.in);
        double base;
        int exponente;

        System.out.println("Introduce la abse (numero real): ");
        base = sc.nextDouble();
        System.out.println("Introduce el exponente (numero entero positivo): ");
        exponente = sc.nextInt();
        while (exponente < 1) {
            System.out.println("El exponente debe ser un numero POSITIVO");
			exponente = sc.nextInt();
        }

        double potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia = potencia * base;
            System.out.println(base + "^" + i + " = " + potencia);
        }
    }

}
