import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array: ");
        int n = sc.nextInt();

        double[] miArray = new double[n];

        llenarArray(miArray);
        imprimirArray(miArray);
        double media = calculaMedia(miArray);
        System.out.println(media);

        double numMasCercano = encontrarNumeroCercano(miArray, media);
        System.out.println(numMasCercano);


    }



    public static void llenarArray(double[] nArray){
        for (int i = 0 ; i< nArray.length; i++){
            nArray[i] = Math.round(Math.random() * 100) / 100.0 ;
        }
    }

    public static void imprimirArray(double[] nArray){
        System.out.println(Arrays.toString(nArray));
    }

    public static double calculaMedia(double[] nArray){
        double suma = 0;

        for (int i = 0 ; i< nArray.length; i++){
            suma += nArray[i];
        }
        return Math.round(suma / nArray.length * 100) / 100.0;
    }

    public static double encontrarNumeroCercano(double[] nArray, double media) {
        double numMasCercano = nArray[0];
        double menorDiferencia = Math.abs(nArray[0] - media);

        for (int i = 1; i < nArray.length; i++) {
            double diferencia = Math.abs(nArray[i] - media);
            if (diferencia < menorDiferencia) {
                menorDiferencia = diferencia;
                numMasCercano = nArray[i];
            }
        }

        return numMasCercano;
    }

    }