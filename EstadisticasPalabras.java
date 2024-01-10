import java.util.Arrays;
import java.util.Scanner;

public class EstadisticasPalabras {

    public static String obtenerCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        return scanner.nextLine();
    }

    public static char[] obtenerConsonantes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las consonantes separadas por espacio: ");
        String consonantesInput = scanner.nextLine().replaceAll(" ", "");
        return consonantesInput.replaceAll("[^a-zA-Z]", "").toUpperCase().toCharArray();
    }

    public static String limpiarCadena(String cadena, char[] consonantes) {
        String cadenaLimpia = "";
        for (char c : cadena.toCharArray()) {
            if (Character.isLetter(c) && contieneConsonante(c, consonantes)) {
                cadenaLimpia += c;
            }
        }
        return cadenaLimpia;
    }

    public static String pasarAMayusculas(String cadena, char[] consonantes) {
        for (char consonante : consonantes) {
            cadena = cadena.replace(consonante, Character.toUpperCase(consonante));
        }
        return cadena;
    }

    public static boolean contieneConsonante(char caracter, char[] consonantes) {
        for (char consonante : consonantes) {
            if (Character.toUpperCase(caracter) == consonante) {
                return true;
            }
        }
        return false;
    }

    public static void contarVocalesConsonantes(String palabra) {
        int vocales = 0;
        int consonantes = 0;

        for (char c : palabra.toCharArray()) {
            if (esVocal(c)) {
                vocales++;
            } else if (Character.isLetter(c)) {
                consonantes++;
            }
        }

        if (vocales > 0 || consonantes > 0) {
            System.out.println("Palabra: " + palabra);
            if (vocales > 0) {
                System.out.println(vocales + (vocales == 1 ? " vocal" : " vocales"));
            }
            if (consonantes > 0) {
                System.out.println(consonantes + (consonantes == 1 ? " consonante" : " consonantes"));
            }
        }
    }

    public static void contarApariciones(String cadena) {
        System.out.println("Apariciones de letras:");

        for (char letra = 'A'; letra <= 'Z'; letra++) {
            int apariciones = 0;
            for (char c : cadena.toCharArray()) {
                if (Character.toUpperCase(c) == letra) {
                    apariciones++;
                }
            }

            if (apariciones > 0) {
                System.out.println(letra + ": " + apariciones + (apariciones == 1 ? " vez" : " veces"));
            }
        }
    }

    public static String ordenarAlfabeticamente(String palabra) {
        char[] letras = palabra.toCharArray();
        Arrays.sort(letras);
        return new String(letras);
    }

    public static boolean esVocal(char caracter) {
        String vocales = "AEIOUÁÉÍÓÚaeiouáéíóú";
        return vocales.indexOf(caracter) != -1;
    }

    public static void main(String[] args) {
        String cadena = obtenerCadena();
        char[] consonantes = obtenerConsonantes();

        String cadenaLimpia = limpiarCadena(cadena, consonantes);
        String resultado = pasarAMayusculas(cadenaLimpia, consonantes);

        System.out.println("Resultado final: " + resultado);

        String[] palabras = resultado.split("\\s+");
        for (String palabra : palabras) {
            contarVocalesConsonantes(palabra);
            String palabraOrdenada = ordenarAlfabeticamente(palabra);
            System.out.println("Palabra ordenada: " + palabraOrdenada);
        }

        contarApariciones(resultado);
    }
}
