import java.util.ArrayList;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        
        // Agregar elementos a la lista1
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        
        // Copiar elementos de lista1 a lista2
        lista2.addAll(lista1);
        
        // Mostrar la lista2
        System.out.println("Lista2: " + lista2);
    }

}
