import java.util.Scanner;

public class InvertirCadenaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadenaOriginal = scanner.nextLine();

        String cadenaInvertida = invertirCadenaRecursiva(cadenaOriginal);
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public static String invertirCadenaRecursiva(String cadena) {
        // Caso base: cadena vacía o de longitud 1
        if (cadena.isEmpty() || cadena.length() == 1) {
            return cadena;
        } else {
            // Llamada recursiva invirtiendo la subcadena excepto el primer carácter
            return invertirCadenaRecursiva(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}
