import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        EncuentraLetra();
        NumeroDiaMes();

    }

    public static void EncuentraLetra(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();


        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
    }

    public static void NumeroDiaMes(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de mes (1-12): ");
        int mes = scanner.nextInt();
        
        System.out.print("Ingresa el año: ");
        int anio = scanner.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));


        int numDias;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDias = 30;
                break;
            case 2:
                if (esBisiesto) {
                    numDias = 29;
                } else {
                    numDias = 28;
                }
                break;
            default:
                System.out.println("Número de mes no válido. Ingresa un valor entre 1 y 12.");
                return;
        }
        System.out.println("El mes " + mes + " del año " + anio + " tiene " + numDias + " días.");

    }
}