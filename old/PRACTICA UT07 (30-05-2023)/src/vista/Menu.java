package vista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    ArrayList<String> listaOpciones;
    private final String linea = "****************************************************************************";

    public Menu(ArrayList<String> listaOpciones) {
        this.listaOpciones = listaOpciones;
    }

    public void verMenu(String titulo) {
        Integer huecos = linea.length() - titulo.length();
        Integer mitadA = (huecos / 2) - 1;
        Integer mitadB = mitadA;
        if (huecos % 2 > 0) {
            mitadB = mitadA + 1;
        }
        System.out.println(linea);
        System.out.print("*");
        for (int i = 0; i < mitadA; i++) {
            System.out.print(" ");
        }
        System.out.print(titulo);
        for (int i = 0; i < mitadB; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        System.out.println(linea);
        int contador = 1;
        for (String opcion : listaOpciones) {
            System.out.println(contador + ": " + opcion);
            contador++;
        }
        System.out.println("0: SALIR");
    }

    public int leerOpcion() {
        System.out.println("------------------------------");
        System.out.print("ELIGE TU OPCIÓN: ");
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        try {
            var leido = sc.nextLine();
            opcion = Integer.parseInt(leido);
        } catch (Exception e) {
            System.out.println("VALOR NO VÁLIDO");
        }
        return opcion;
    }
}
