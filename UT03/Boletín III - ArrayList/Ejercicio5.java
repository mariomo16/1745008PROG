import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Creamos un ArrayList de cadenas de texto
        ArrayList<String> lista = new ArrayList<>();
        
        // Agregamos algunos elementos a la lista
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!");
        
        System.out.println("Lista original: " + lista);
        
        // Actualizamos el segundo elemento de la lista con una nueva cadena de texto
        lista.set(1, "Mario");
        
        System.out.println("Lista actualizada: " + lista);
    }

}
