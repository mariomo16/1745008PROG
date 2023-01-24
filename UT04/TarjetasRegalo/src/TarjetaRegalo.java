import java.util.Random;

@SuppressWarnings("unused")
public class TarjetaRegalo {

    // Atributoss
    private double saldo;
    private Integer identificador;

    // Constructor
    public TarjetaRegalo(double Saldo) {
        saldo = Saldo;
        identificador = gen();
    }

    // Constructor 2
    public TarjetaRegalo(double Saldo1, double Saldo2) {
        saldo = Saldo1 + Saldo2;
        identificador = gen();
    }

    // Generador identificador (numero) de 5 digitos random.
    private Integer gen() {
        Random r = new Random(System.currentTimeMillis());
        return 10000 + r.nextInt(89999);
    }

    // Getter identificador
    public Integer getIdentificador() {
        return identificador;
    }

    // Setter saldo
    public void setSaldo(double Saldo) {
        saldo = Saldo;
    }

    // Getter saldo
    public double getSaldo() {
        return saldo;
    }

    // Metodo gastarSaldo
    public boolean gastarSaldo(Integer cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            return true;
        } else {
            return false;
        }
    }

}