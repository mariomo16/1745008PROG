public class Ejercicio9 {
    public static void main(String[] args) {
        int inicio = 2;
        int fin = 100;

        System.out.println("Numeros primos entre " + inicio + " y " + fin + ":");

        for (int i = inicio; i <= fin; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    }
    
}
