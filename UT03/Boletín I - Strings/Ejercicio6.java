import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");

        // Se lee la frase introducida por el usuario con el método nextLine() y se asigna a la variable frase
        // Se convierte la frase a minúsculas con el método toLowerCase() 
        // y se eliminan los espacios con el método replaceAll("\\s", "").
        String frase = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        // Se crea una nueva cadena fraseInvertida que es la inversa de la cadena frase 
        // utilizando la clase StringBuilder y su método reverse().
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        
        // Se compara la cadena frase con la cadena fraseInvertida. 
        // Si son iguales, se muestra un mensaje indicando que la frase es un palíndromo. 
        // Si no son iguales, se muestra un mensaje indicando que la frase no es un palíndromo.
        if (frase.equals(fraseInvertida)) {
            System.out.println("La frase es un palíndromo");
        } else {
            System.out.println("La frase no es un palíndromo");
        }
    }

}