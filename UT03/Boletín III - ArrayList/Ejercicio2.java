import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> listaElementos = new ArrayList<String>();

        listaElementos.add("elemento1");
        listaElementos.add("elemento2");
        listaElementos.add("elemento3");

        for (int i = 0; i < listaElementos.size(); i++) {
            String elemento = listaElementos.get(i);
            System.out.println(elemento);
        }
    }
    
}
