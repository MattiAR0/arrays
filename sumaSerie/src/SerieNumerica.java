import java.util.Arrays;
import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        System.out.print("Introduce el valor del término en el que finaliza la serie (mayor que 10): ");
        int numOperandos = sc.nextInt();

        int[] serie = calculaSerieNumerica(numOperandos);

        if (serie == null) {
            System.out.println("El número introducido debe ser mayor que 10.");
        } else {
            for (int i : serie) {
                suma += i;
            }
        }

        System.out.println("La suma de la serie " + Arrays.toString(serie) + " da como resultado " + suma);

        sc.close();
        System.exit(0);
    }


    public static int[] calculaSerieNumerica(int numOperandos) {

        final int INCREMENTO = 3;

        if (numOperandos <= 10) {
            return null;
        }

        int[] intArray = new int[numOperandos];

        for (int i = 0; i < intArray.length; i++) {

            if (i == 0) {
                intArray[0] = 1;
            } else {
                intArray[i] = intArray[i - 1] + INCREMENTO;
            }
        }
        return intArray;
    }
    }
