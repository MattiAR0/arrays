import java.util.Scanner;

public class ContarLetraEnCadenaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String texto = scanner.nextLine();

        System.out.print("Introduce una letra: ");
        char letraBuscada = scanner.next().charAt(0);

        int resultado = contarLetraEnCadenaRecursiva(texto, letraBuscada);
        System.out.println("El número de veces que la letra \"" + letraBuscada + "\" aparece en \"" + texto + "\" es: " + resultado);
    }

    public static int contarLetraEnCadenaRecursiva(String cadena, char letra) {
        // Caso base: cadena vacía
        if (cadena.isEmpty()) {
            return 0;
        } else {
            // Comprobamos si el primer carácter es igual a la letra y llamamos recursivamente con la subcadena
            return (cadena.charAt(0) == letra ? 1 : 0) + contarLetraEnCadenaRecursiva(cadena.substring(1), letra);
        }
    }
}
