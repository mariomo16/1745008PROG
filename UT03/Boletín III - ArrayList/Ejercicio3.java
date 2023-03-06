import java.util.ArrayList;

public class Ejercicio3 {
   public static void main(String[] args) {
       // Creamos un ArrayList de String
       ArrayList<String> lista = new ArrayList<>();
       
       // Agregamos algunos elementos
       lista.add("Hola");
       lista.add("Mundo");
       
       // Imprimimos el ArrayList antes de la inserción
       System.out.println("Lista antes de la insercion: " + lista);
       
       // Insertamos un elemento en la primera posición
       lista.add(0, "¡Bienvenido!");
       
       // Imprimimos el ArrayList después de la inserción
       System.out.println("Lista despues de la insercion: " + lista);
   }

}
