import java.util.ArrayList;

public class Ejercicio21 {
    public static void main(String[] args) {
        // Creamos un ArrayList con algunos elementos
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        // Imprimimos el ArrayList antes de reemplazar el segundo elemento
        System.out.println("ArrayList antes de reemplazar el segundo elemento: " + lista);
        
        // Reemplazamos el segundo elemento con el elemento especificado
        lista.set(1, "d");
        
        // Imprimimos el ArrayList después de reemplazar el segundo elemento
        System.out.println("ArrayList despues de reemplazar el segundo elemento: " + lista);
    }
    
}
