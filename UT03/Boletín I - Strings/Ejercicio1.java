public class Ejercicio1 {

    public static void main(String[] args) {
        // Declaración de 5 variables de tipo char
        char var1 = 'H';
        char var2 = 'o';
        char var3 = 'l';
        char var4 = 'a';
        char var5 = '!';

        // Concatenación de las variables char en una cadena
        String cadena = "" + var1 + var2 + var3 + var4 + var5;

        // Muestra la cadena resultante por pantalla
        System.out.println(cadena);

        // Si no se utiliza la cadena vacía "" antes de la primera variable, 
        // el programa intentará sumar las variables de tipo char como enteros y no concatenarlas como cadenas, 
        // lo que generará un error. Al utilizar la cadena vacía como primer operando, 
        // se fuerza a Java a realizar una concatenación de cadenas en vez de una suma de enteros.
    }

}