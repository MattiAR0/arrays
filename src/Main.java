import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el ejercicio a hacer \n" +
                "1) Invertir los elementos un array. \n" +
                "2) Sumar los elementos de un array \n" +
                "3) Busca el valor maximo \n" +
                "4) Ordenar cadena");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1 -> invertirArray();
            case 2 -> sumaArray();
            case 3 -> encontrarMaximo();
            case 4 -> ordenarCadena();
        }

    }

    public static void invertirArray(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array: ");
        int tamano = sc.nextInt();
        tamano = Math.abs(tamano);

        int[] miArray = new int[tamano];

        System.out.println("Introduce los valores del array");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            miArray[i] = sc.nextInt();
        }
        int[] resultado = new int[miArray.length];

        for (int i = 0; i < miArray.length; i++){
            resultado[i] = miArray[miArray.length - 1 - i];
        }

        System.out.println("Elementos del array invertido:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    public static void sumaArray(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array: ");
        int tamano = sc.nextInt();
        tamano = Math.abs(tamano);

        int[] miArray = new int[tamano];

        System.out.println("Introduce los valores del array");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            miArray[i] = sc.nextInt();
        }
        int suma = 0;
        for (int i: miArray) {
            suma += i;
        }
        System.out.println("La suma de todos los elementos del array es: " + suma);

    }

    public static void encontrarMaximo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array: ");
        int tamano = sc.nextInt();
        tamano = Math.abs(tamano);

        int[] miArray = new int[tamano];

        System.out.println("Introduce los valores del array");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            miArray[i] = sc.nextInt();
        }

        int maximo = miArray[0];
        for (int elemento : miArray) {
            if (elemento > maximo) {
                maximo = elemento;
            }
        }

        System.out.println("El valor maximo es: " + maximo);

    }

    public static void ordenarCadena(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las cadenas separadas por comas:");
        String cadenas = scanner.nextLine();

        String[] arrayCadenas = cadenas .split(",\\s*");

        Arrays.sort(arrayCadenas);
        System.out.println(Arrays.toString(arrayCadenas));

    }
}

