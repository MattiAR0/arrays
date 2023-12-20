import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] arrayPalabras = new String[5];
        llenarVector(arrayPalabras);

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la palabra que quieres buscar: ");
        String palabra = sc.nextLine();

        int posicion = buscarPalabra(arrayPalabras, palabra);

        if (posicion != -1){
            System.out.println("La palabra " + palabra + "se encuentra en la posicion " + posicion );
        }else {
            System.out.println("La palabra introducida no se encuentra en el array");
        }

    }
    public static void llenarVector(String[] arrayPalabras) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayPalabras.length; i++) {
            System.out.print("Ingrese una palabra para la posición " + i + ": ");
            arrayPalabras[i] = sc.nextLine();
        }
    }

    public static int buscarPalabra(String[] arrayPalabras, String palabra) {
        for (int i = 0; i < arrayPalabras.length; i++){
            if (arrayPalabras[i].equalsIgnoreCase(palabra)){
                return i;
            }
        }
        return -1;
    }


}