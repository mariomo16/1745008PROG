import java.util.Random;

@SuppressWarnings("unused")
public class TarjetaRegalo {

    // Atributoss
    private double saldoCuenta;
    private Integer identificador;

    // Constructor
    public TarjetaRegalo(Integer saldoTarjeta) {
    }

    public void tarjetaUno(double saldoTarjeta) {
        double saldoCuenta;
        Integer identificador;
    }

    public void tarjetaDos(double saldoTarjeta) {
        double saldoCuenta;
        Integer identificador;
    }

    // Generador identificador (numero) de 5 digitos random.
    private Integer gen() {
        Random r = new Random(System.currentTimeMillis());
        return 10000 + r.nextInt(89999);
    }

    // Getter identificador
    public Integer getIdentificador(Integer identificador) {
        return identificador = gen();
    }

    // Metodo gastarSaldo
    public boolean gastarSaldo(Integer cantidad) {
        if (saldoCuenta >= cantidad) {
            saldoCuenta = saldoCuenta - cantidad;
            return true;
        } else {
            return false;
        }
    }

}
