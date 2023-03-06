import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        // Agregar elementos a la lista
        lista.add(5);
        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        
        // Ordenar la lista en orden ascendente
        Collections.sort(lista);
        
        // Mostrar la lista ordenada
        System.out.println("Lista ordenada en orden ascendente: " + lista);
    }
    
}
