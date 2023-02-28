package main;

import java.util.ArrayList;
import java.util.Scanner;

import datos.Documentos;

public class App {
    static Documentos miDocumento = new Documentos();
    static Menu miMenu;
    public static void main(String[] args) {
        int opcion=99;
        crearMenu();

        do {
            miMenu.verMenu();
            opcion = miMenu.leerOpcion();
            switch (opcion) {
                case 1: 
                    escribir();
                break;
                case 2: 
                    miDocumento.guardar();
                break;

            }
        } while (opcion!=0);
        
    }       
    
    public static void escribir() {
        String linea = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe lineas (fin para terminar):");
        do {
            linea = sc.nextLine();
            if (!linea.equals("fin")) {
                miDocumento.nuevaLinea(linea);
            }
        } while (!linea.equals("fin"));
        miDocumento.guardar();
    }

    public static  void crearMenu() {
        ArrayList<String> listaOpciones = new ArrayList<>();
        listaOpciones.add("Escribir en el documento");
        listaOpciones.add("GUARDAR");
        miMenu = new Menu(listaOpciones, "DOCUMENTOS");

    }
}