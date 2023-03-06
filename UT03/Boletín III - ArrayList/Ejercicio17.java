import java.util.ArrayList;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Creamos un ArrayList de ejemplo
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        // Imprimimos el ArrayList original
        System.out.println("ArrayList original: " + lista);
        
        // Vaciamos el ArrayList
        lista.clear();
        
        // Imprimimos el ArrayList después de vaciarlo
        System.out.println("ArrayList despues de vaciarlo: " + lista);
    }

}
