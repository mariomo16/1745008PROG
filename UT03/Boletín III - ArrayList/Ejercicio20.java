import java.util.ArrayList;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Creamos un ArrayList con una capacidad inicial de 10 elementos
        ArrayList<String> lista = new ArrayList<String>(10);
        
        // Imprimimos la capacidad del ArrayList antes de aumentarla
        System.out.println("Capacidad del ArrayList antes de aumentarla: " + lista.size());
        
        // Aumentamos la capacidad del ArrayList a 20 elementos
        lista.ensureCapacity(20);
        
        // Imprimimos la capacidad del ArrayList después de aumentarla
        System.out.println("Capacidad del ArrayList después de aumentarla: " + lista.size());
    }
    
}
