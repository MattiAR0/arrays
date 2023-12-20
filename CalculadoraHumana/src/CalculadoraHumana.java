import java.util.Scanner;

public class CalculadoraHumana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = {14, 6, 17, 30, 23};
        int suma = 0;
        boolean esCorrecto = true;

        System.out.println("Vaya sumando todos los números que le iré diciendo. Empezamos por 0.");

        for (int i = 0 ; i < numeros.length ; i ++) {
            System.out.print("Más " + numeros[i] +": ");
            int respuesta = sc.nextInt();

            suma += numeros[i];

            if (respuesta != suma) {
                System.out.println("Te has equivocado, pero has acertado " + i + " veces seguidas.");
                esCorrecto = false;
                break;
            }
        }

        if (esCorrecto) {
            System.out.println("Enhorabuena, GANASTE.");
        }
    }
}