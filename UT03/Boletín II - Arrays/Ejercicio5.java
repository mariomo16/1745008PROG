public class Ejercicio5 {

    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        // Rellenamos el primer array con los valores del 1 al 100
        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }

        // Copiamos los valores del primer array al segundo array en orden inverso
        for (int i = 0; i < 100; i++) {
            array2[i] = array1[99 - i];
        }

        // Mostramos los dos arrays por pantalla
        System.out.println("Array 1:");
        for (int i = 0; i < 100; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n\nArray 2:");
        for (int i = 0; i < 100; i++) {
            System.out.print(array2[i] + " ");
        }
    }
    
}