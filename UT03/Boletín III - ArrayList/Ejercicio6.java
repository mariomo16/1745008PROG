import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creamos un ArrayList de enteros
        ArrayList<Integer> lista = new ArrayList<>();
        
        // Agregamos algunos elementos a la lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        
        System.out.println("Lista original: " + lista);
        
        // Eliminamos el tercer elemento de la lista
        lista.remove(2);
        
        System.out.println("Lista actualizada: " + lista);
    }
}
