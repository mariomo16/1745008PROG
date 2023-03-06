import java.util.ArrayList;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Creamos un ArrayList con una capacidad inicial de 10 elementos
        ArrayList<String> lista = new ArrayList<String>(10);
        
        // Agregamos algunos elementos a la lista
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        // Imprimimos la capacidad del ArrayList antes de recortarla
        System.out.println("Capacidad del ArrayList antes de recortarla: " + lista.size());
        
        // Recortamos la capacidad del ArrayList al tamaño actual de la lista
        lista.trimToSize();
        
        // Imprimimos la capacidad del ArrayList después de recortarla
        System.out.println("Capacidad del ArrayList despues de recortarla: " + lista.size());
    }

}
