public class OperacionesMatematicas {

    // Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
    public boolean esCapicua(int num) {
        int numOriginal = num;
        int numReverso = 0;
        while (num > 0) {
            int ultimoDigito = num % 10;
            numReverso = numReverso * 10 + ultimoDigito;
            num /= 10;
        }
        return numOriginal == numReverso;
    }

    // Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    public boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    public int siguientePrimo(int num) {
    int sigPrimo = num + 1;
    while (!esPrimo(sigPrimo)) {
        sigPrimo++;
    }
    return sigPrimo;
    }

    // Dada una base y un exponente devuelve la potencia.
    public double potencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
    // Cuenta el número de dígitos de un número entero.
    public int digitos(int num) {
        if (num == 0) {
            return 1;
        }
        int contador = 0;
        while (num > 0) {
            contador++;
            num /= 10;
        }
        return contador;
    }

    // Le da la vuelta a un número.
    public int voltea(int num) {
        int numReverso = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            numReverso = numReverso * 10 + lastDigit;
            num /= 10;
        }
        return numReverso;
    }

    // Devuelve el dígito que está en la posición n de un número entero.
    // Se empieza contando por el 0 y de izquierda a derecha.   
    // num = Numero entero.
    // n = Posicion del digito que quieres devolver del numero entero.
    public int digitoN(int num, int n) {
        return Character.getNumericValue(String.valueOf(num).charAt(n));
    }

    // Da la posición de la primera ocurrencia de un dígitodentro de un número entero. 
    // Si no se encuentra, devuelve -1.
    // num = Numero entero.
    // digito = Digito que deseas buscar.
    public int posicionDeDigito(int num, int digito) {
        return String.valueOf(num).indexOf(String.valueOf(digito));
    }

    // Le quita a un número n dígitos por detrás (por laderecha).
    // num = Numero entero.
    // n = Numero de digitos que deseas quitar.
    public int quitaPorDetras(int num, int n) {
        return num / (int) Math.pow(10, n);
    }

    // Le quita a un número n dígitos por delante (por laizquierda).
    // num = Numero entero.
    // n = Numero de digitos que deseas quitar.
    public int quitaPorDelante(int num, int n) {
        String str = String.valueOf(num);
        str = str.substring(n);
        return Integer.parseInt(str);
    }
    
    // Añade un dígito a un número por detrás.
    // num = Numero entero.
    // digito = Digito que deseas agregar al entero.
    public int pegaPorDetras(int num, int digito) {
        return (num * 10) + digito;
    }

    // Añade un dígito a un número por delante.
    // num = Numero entero.
    // digito = Digito que deseas agregar al entero.
    public int pegaPorDelante(int num, int digito) {
        String str = String.valueOf(digito) + String.valueOf(num);
        return Integer.parseInt(str);
    }
    
    // Toma como parámetros las posiciones inicial y final
    // dentro de un número y devuelve el trozo correspondiente.
    // num = Numero entero.
    // inicio = Posicion inicial del numero entero.
    // fin = Posicion final del numero entero.
    public int trozoDeNumero(int num, int inicio, int fin) {
        String str = String.valueOf(num);
        str = str.substring(inicio, fin);
        return Integer.parseInt(str);
    }
    

    // Pega dos números para formar uno.
    // a = Numero 1 que deseas juntar.
    // b = Numero 2 que deseas juntar.
    public int juntaNumeros(int a, int b) {
        String str = String.valueOf(a) + String.valueOf(b);
        return Integer.parseInt(str);
    }

}