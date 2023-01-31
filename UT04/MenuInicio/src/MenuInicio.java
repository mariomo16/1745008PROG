import java.util.ArrayList;

public class MenuInicio {

    // Atributos
    private ArrayList<String> opciones;
    private Integer opcion;

    // Constructor
    public MenuInicio() {
        opciones = new ArrayList<String>();
    }

    // ArrayList Opciones
    private static void arrayList(String[] args) {
        ArrayList<String> opciones = new ArrayList<String>();
        opciones.add("*******************************");
        opciones.add("*       TARJETAS REGALO       *");
        opciones.add("*        MARIO MORALES        *");
        opciones.add("*******************************");
        opciones.add("");
        opciones.add("¿Que tarjeta regalo quieres usar?");
        opciones.add("1: Usar Tarjeta Regalo 1.");
        opciones.add("2: Usar Tarjeta Regalo 2.");
        opciones.add("3: Combinar tarjetas regalo.");
        opciones.add("0: SALIR");
        System.out.println(opciones);
    }

    // Getter ArrayList Opciones
    public ArrayList getOpciones() {
        return opciones;
    }

}
