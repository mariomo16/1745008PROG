package datos;

import java.util.ArrayList;
import archivos.Archivos;

public class Documentos {
    private ArrayList<String> miArrayList;
    private Archivos miArchivo;


    public Documentos() {
        miArrayList = new ArrayList<>();
        miArchivo = new Archivos();
    }

    public void nuevaLinea(String linea) {
        miArrayList.add(linea + "\n");        
    }

    public void guardar() {
        miArchivo.escribe(miArrayList);
    }

    public ArrayList<String> getMiArrayList() {
        return miArrayList;
    }
    
}
