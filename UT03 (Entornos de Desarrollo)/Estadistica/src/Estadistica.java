import java.util.Scanner;

public class Estadistica {
    Scanner sc = new Scanner(System.in);
    private Integer numero, inverso = 0, numero2, cifra;

    public Estadistica() {
    }

    private boolean esCapicua(Integer numero) {
        do {
            System.out.print("Introduce un numero: ");                                                 
            numero = sc.nextInt();
        } while (numero < 1);
       
        // Le damos la vuelta al número
        numero2 = numero;
        while (numero2!=0){
            cifra = numero2 % 10;
            inverso = inverso * 10 + cifra;
            numero2 = numero2 / 10;
        }
    
        // Comprobamos si el numero es igual al invertirlo
        if(numero == inverso){
            System.out.println("Es capicua");
            return true;
        }else{
            System.out.println("No es capicua");
            return false;
        }
    }

    public boolean getCapicua() {
        return esCapicua(numero);
    }

    private void esPrimo(Integer numero) {
        // El 0, 1 y 4 no son primos.
        if (numero == 0 || numero == 1 || numero == 4) {
            System.out.println("El numero " + numero + " no es primo");
        }
        for (int x = 2; x < numero / 2; x++) {
          // Si es divisible por cualquiera de estos números, no es primo.
          if (numero % x == 0)
            System.out.println("El numero " + numero + " es primo");
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo.
        System.out.println("El numero " + numero + " no es primo");
    }

    private Integer siguientePrimo(Integer numero) {
        return numero;

    }


}