import java.util.ArrayList;
import java.util.List;

public class Ejercicio12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ordenador");
        lista.add("Portatil");
        lista.add("Movil");
        lista.add("Tablet");
        lista.add("Google Nest");

        System.out.println("Lista original: " + lista);

        List<String> sublist = lista.subList(1, 4);

        System.out.println("Lista extraida: " + sublist);
    }
    
}
