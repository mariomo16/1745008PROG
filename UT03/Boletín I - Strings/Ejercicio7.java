import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cadena de texto
        System.out.println("Introduce una cadena de texto:");
        String cadena = scanner.nextLine();

        // Reemplazar las A minúsculas por A mayúsculas (excepto si van precedidas de un espacio)
        // Se utiliza el método replaceAll de la clase String para reemplazar todas las letras "a" minúsculas 
        // por letras "A" mayúsculas, excepto si van precedidas de un espacio. 
        // Para ello, se utiliza una expresión regular que busca la letra "a" que no está precedida por un espacio ((?<!\\s)a).
        cadena = cadena.replaceAll("(?<!\\s)a", "A");

        // Mostrar las iniciales
        // Para ello, se divide la cadena en palabras utilizando el método split de la clase String, 
        // que divide la cadena en subcadenas separadas por un espacio. 
        // A continuación, se recorre el array de palabras y se obtiene la primera letra de cada una de ellas.
        String iniciales = "";
        String[] palabras = cadena.split("\\s+");
        for (String palabra : palabras) {
            iniciales += palabra.charAt(0);
        }
        System.out.println("Iniciales: " + iniciales);

        // Mostrar letras impares en mayúsculas y letras pares en minúsculas
        // Se muestra la cadena de texto resultante en la que las letras impares están en mayúsculas 
        // y las letras pares en minúsculas. Para ello, se recorre la cadena de texto original 
        // y se utiliza la variable i como contador para determinar si la letra actual está en una posición par o impar. 
        // Se utiliza el método Character.toUpperCase y Character.toLowerCase de la clase Character 
        // para convertir las letras a mayúsculas o minúsculas, según corresponda.
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (i % 2 == 0) {
                resultado += Character.toLowerCase(letra);
            } else {
                resultado += Character.toUpperCase(letra);
            }
        }
        System.out.println("Resultado: " + resultado);
    }
    
}