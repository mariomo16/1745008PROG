import java.util.ArrayList;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Creamos un ArrayList vacío y lo imprimimos
        ArrayList<String> listaVacia = new ArrayList<String>();
        System.out.println("ArrayList vacio: " + listaVacia);
        
        // Creamos un ArrayList con elementos y lo imprimimos
        ArrayList<String> listaNoVacia = new ArrayList<String>();
        listaNoVacia.add("a");
        listaNoVacia.add("b");
        listaNoVacia.add("c");
        System.out.println("ArrayList con elementos: " + listaNoVacia);
        
        // Probamos si los ArrayLists están vacíos
        System.out.println("El ArrayList vacio esta vacio? " + listaVacia.isEmpty());
        System.out.println("El ArrayList con elementos esta vacio? " + listaNoVacia.isEmpty());
    }

}
