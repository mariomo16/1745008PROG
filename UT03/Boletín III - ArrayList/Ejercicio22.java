import java.util.ArrayList;

public class Ejercicio22 {
    public static void main(String[] args) {
        // Creamos un ArrayList con algunos elementos
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        // Imprimimos los elementos del ArrayList usando la posición de los elementos
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento " + i + ": " + lista.get(i));
        }
    }
    
}
