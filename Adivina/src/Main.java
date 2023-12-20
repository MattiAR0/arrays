import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano = 0;
        int digitoFinal = 0;

        do {
            System.out.println("Introduce el tamaño del array (tiene que ser mayor que 0): ");
            tamano = sc.nextInt();
        } while (tamano <= 0);

        int[] arrayAleatorio = crearVector(tamano);

        do {
            System.out.println("Introduce el digito final: ");
            digitoFinal = sc.nextInt();
        } while (digitoFinal < 0);

        System.out.println(Arrays.toString(arrayAleatorio));
        filtrarArray(arrayAleatorio, digitoFinal);

    }



    public static int[] crearVector(int tamano) {
        int[] nArray = new int[tamano];

        for (int i = 0; i < tamano; i++){
            nArray[i] = (int) (Math.random() * 300) + 1;
        }
        return nArray;
    }

    public static void filtrarArray(int[] arrayAleatorio, int digitoFinal) {
        for (int num : arrayAleatorio){
            if (num % 10 == digitoFinal){
                System.out.println(num + " ");
            }
        }
        System.out.println();
    }
}