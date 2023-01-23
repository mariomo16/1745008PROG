import java.util.ArrayList;

public class cuentaCorriente {

    // Atributos siempre privados (Saldo y movimientos).
    // Siempre hay que especificar si es publi/private, el tipo de dato que almacenara, y el nombre.
    private static Double Saldo = 0.0;
    private ArrayList<Integer> movimientos;

    // Constructor siempre justo debajo de atributos.
    // Siempre tiene el mismo nombre que la clase.
    public cuentaCorriente(Double Saldo) {
        movimientos = new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        ArrayList<Integer> movimientos = new ArrayList<Integer>();
        movimientos.add(25);
        movimientos.get(0);

        // En Integer "esteMovimiento" estamos guardando un entero que cogemos del ArrayList "movimientos",
        // para no perder los datos del ArrayList "movimientos".
        // La variable donde guardamos temporalmente los datos tiene que ser del mismo
        // tipo que el original (Integer).
        for (Integer esteMovimiento : movimientos) {
            if (esteMovimiento < 0) {

            }
        }
    }

    // Con (Integer cantidad) le indicamos que cuando llamemos al metodo "Ingresar", ingresaremos
    // un entero (Integer) y se guardara en "cantidad".
    public void Ingresar(Integer cantidad) {
        Saldo = Saldo + cantidad;
        movimientos.add(cantidad);
    }

    // (0 - cantidad) Para que nos devuelva un numero negativo ya que es una retirada.
    public boolean Retirar(Integer cantidad) {
        if (Saldo >= cantidad) {
            Saldo = Saldo - cantidad;
            movimientos.add(0 - cantidad);
            return true;
        } else {
            return false;
        }
    }

    // Aqui indicamos que cuando llamemos al metodo "consultarSaldo",
    // nos devolvera (return) un Double (Saldo).
    public double consultarSaldo() {
        return Saldo;
    }

    // Aqui indicamos que cuando llamemos al metodo "listaMovimientos",
    // nos devolvera los datos que tenga en el ArrayList "movimientos".
    public ArrayList<Integer> listaMovimientos(int opcion) {
        return movimientos;
    }

}