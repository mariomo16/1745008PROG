import java.util.ArrayList;

public class CuentaCorriente {

    // Atributos siempre privados (saldo y movimientos).
    // Siempre hay que especificar si es public/private, el tipo de dato que almacenara, y el nombre.
    private static double saldo = 0.0;
    private ArrayList<Integer> movimientos;

    // Constructor siempre justo debajo de atributos.
    // Siempre tiene el mismo nombre que la clase.
    public CuentaCorriente(double saldo) {
        movimientos = new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        ArrayList<Integer> movimientos = new ArrayList<Integer>();
        movimientos.add(25);
        movimientos.get(0);
    }

    // Con (Integer cantidad) le indicamos que cuando llamemos al metodo "Ingresar", ingresaremos
    // un entero (Integer) y se guardara en "cantidad".
    public void Ingresar(Integer cantidad) {
        saldo = saldo + cantidad;
        movimientos.add(cantidad);
    }

    // (0 - cantidad) Para que nos devuelva un numero negativo ya que es una retirada.
    public boolean Retirar(Integer cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            movimientos.add(0 - cantidad);
            return true;
        } else {
            return false;
        }
    }

    // Aqui indicamos que cuando llamemos al metodo "consultarsaldo",
    // nos devolvera (return) un double (saldo).
    public double consultarSaldo() {
        return saldo;
    }

    // Aqui indicamos que cuando llamemos al metodo "listaMovimientos",
    // nos devolvera los datos que tenga en el ArrayList "movimientos".
    public ArrayList<Integer> listaMovimientos(int opcion) {
        return movimientos;
    }

}