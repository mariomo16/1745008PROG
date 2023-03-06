import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
        // Agregar elementos a la lista
        lista.add("Ordenador");
        lista.add("Portatil");
        lista.add("Movil");
        lista.add("Tablet");
        
        // Preguntar al usuario qué elemento desea buscar
        System.out.print("Ingrese el elemento que desea buscar: ");
        String elementoBuscado = sc.nextLine();
        
        // Buscar el elemento en la lista
        int indice = lista.indexOf(elementoBuscado);
        if (indice != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posicion " + indice + " de la lista.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en la lista.");
        }
    }
    
}
