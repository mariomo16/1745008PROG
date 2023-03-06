import java.util.ArrayList;

public class Ejercicio16 {
    public static void main(String[] args) {
        
        // Creamos un ArrayList de ejemplo
        ArrayList<String> listaOriginal = new ArrayList<String>();
        listaOriginal.add("a");
        listaOriginal.add("b");
        listaOriginal.add("c");
        
        // Clonamos el ArrayList en otro ArrayList
        ArrayList<String> listaClonada = (ArrayList<String>) listaOriginal.clone();
        
        // Imprimimos los dos ArrayLists para verificar que se hayan clonado correctamente
        System.out.println("ArrayList original: " + listaOriginal);
        System.out.println("ArrayList clonado: " + listaClonada);
    }
    
}
