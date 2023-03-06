import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Creamos un ArrayList de ejemplo
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
        // Imprimimos el ArrayList original
        System.out.println("ArrayList original: " + numeros);
        
        // Intercambiamos los elementos en las posiciones 1 y 3
        Collections.swap(numeros, 1, 3);
        
        // Imprimimos el ArrayList después del intercambio
        System.out.println("ArrayList despues del intercambio: " + numeros);
    }

}
