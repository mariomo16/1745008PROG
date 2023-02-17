public class Ejercicio1 {
    public static void main(String[] args) {

    char var1 = 'a';
    char var2 = 'b';
    char var3 = 'c';
    char var4 = 'd';
    char var5 = 'e';

    String cadena = "" + (var1 + var2 + var3 + var4 + var5);

    System.out.println(cadena);

    // El problema está en el orden en que se realizan las operaciones: 
    // primero se está concatenando una cadena vacía ("") con el primer carácter (var1) 
    // y el resultado de esta operación es una cadena. 
    // Luego, se están concatenando más caracteres a esa cadena, en lugar de concatenar caracteres individualmente. 
    // La solución es utilizar paréntesis para agrupar las operaciones de concatenación de caracteres,
    }
}
