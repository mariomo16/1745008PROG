import java.util.ArrayList;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Creamos dos ArrayLists de ejemplo
        ArrayList<String> lista1 = new ArrayList<String>();
        lista1.add("a");
        lista1.add("b");
        
        ArrayList<String> lista2 = new ArrayList<String>();
        lista2.add("c");
        lista2.add("d");
        lista2.add("e");
        
        // Unimos los dos ArrayLists en uno solo
        ArrayList<String> listaUnion = new ArrayList<String>(lista1);
        listaUnion.addAll(lista2);
        
        // Imprimimos el ArrayList unido
        System.out.println("ArrayList unido: " + listaUnion);
    }
    
}
