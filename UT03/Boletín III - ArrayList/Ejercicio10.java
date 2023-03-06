import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ordenador");
        lista.add("Portatil");
        lista.add("Movil");
        lista.add("Tablet");
        lista.add("Google Nest");

        System.out.println("Lista original: " + lista);

        Collections.shuffle(lista);

        System.out.println("Lista mezcada: " + lista);
    }
    
}
