import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creamos un ArrayList de String
        ArrayList<String> lista = new ArrayList<>();

        // Agregamos algunos elementos
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!");

        // Recuperamos el elemento en el índice 1
        String elemento = lista.get(1);
       
       // Imprimimos el elemento recuperado
       System.out.println("El elemento en el indice 1 es: " + elemento);
    }

}
