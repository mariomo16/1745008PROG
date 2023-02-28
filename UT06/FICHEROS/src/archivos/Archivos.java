package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Archivos
 * Gestiona la gestion de ficheros en disco
 **/
public class Archivos {
    private String nombreFichero= "archivo.txt";

    public  Archivos() {
        try {
            File miFichero = new File(nombreFichero);
            miFichero.createNewFile();            
        } catch (IOException e) {
            //System.out.println("Hay un error.");
            e.printStackTrace();
        }
    }

    /*
     * lee el archivo y lo 
     * almacena en un arraylist
     */
    public ArrayList<String> lee() { 
        File miFichero = new File(nombreFichero);       
        ArrayList<String> documento = new ArrayList<>();
        try {
            
            Scanner myReader = new Scanner(miFichero);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                documento.add(data);
            }            
            myReader.close();            
        } catch (FileNotFoundException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return documento;        
    }

    public void escribe(ArrayList<String> documento) {
        try {
            FileWriter myWriter = new FileWriter(nombreFichero);
            for (String linea : documento) {
                myWriter.write(linea);
            }            
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public boolean borra() {
        File myObj = new File(nombreFichero);
        return myObj.delete();
    }
}
