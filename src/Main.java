import sun.misc.Unsafe;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ejer1();
        ejer2();
        ejer3();
        ejer4();
        ejer5();
        ejer6();
    }

    public static void ejer1() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }

    public static void ejer2() {
        int[] array = {1, 2, 3, 4, 5};
        int[] copiaVector = Arrays.copyOf(array, array.length);

        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Copia: " + Arrays.toString(copiaVector));
    }

    public static void ejer3() {
        int[] array = {1, 2, 3, 4, 5};
        int[] subArray = Arrays.copyOfRange(array, 1, 4);
        System.out.println("subarray: " + Arrays.toString(subArray));
    }

    public static void ejer4() {
        int[] array = {1, 2, 3, 4, 5};
        int[] otroArray = {1, 2, 3, 4, 5};

        System.out.println("¿Los vectores son iguales? " + Arrays.equals(array, otroArray));
    }

    public static void ejer5() {
        int[] array = {1, 5, 4, 3, 2};
        Arrays.sort(array);
        System.out.println("Vector ordenado: " + Arrays.toString(array));
    }

    public static void ejer6() {
        int[] array = {1, 5, 4, 3, 2};
        Arrays.sort(array, 1, 4);
        System.out.println("Vector ordenado: " + Arrays.toString(array));
    }
}