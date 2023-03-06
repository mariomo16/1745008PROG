import java.util.ArrayList;

public class Ejercicio13 {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("ordenador");
        lista1.add("portatil");
        lista1.add("google nest");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("ordenador");
        lista2.add("portatil");
        lista2.add("google nest");

        ArrayList<String> lista3 = new ArrayList<>();
        lista3.add("ordenador");
        lista3.add("portatil");
        lista3.add("alexa");

        boolean isEqual1 = lista1.equals(lista2);
        boolean isEqual2 = lista1.equals(lista3);

        System.out.println("Lista1 es igual que Lista2: " + isEqual1);
        System.out.println("Lista1 es igual que Lista3: " + isEqual2);
    }
    
}
