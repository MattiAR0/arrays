import java.util.Scanner;

public class Palindromos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palindromos;

        System.out.println("Introduzca una frase para detectar si contiene algún palíndromo: ");
        frase = sc.nextLine();

        palindromos = buscaPalindromos(frase);
        if (palindromos != null) {
            System.out.println("La frase introducida contiene los siguientes palíndromos: " + palindromos);
        } else {
            System.out.println("La frase introducida no contiene palíndromos.");
        }
        System.exit(0);
    }

    public static String buscaPalindromos(String frase) {

        final String EMPTY = " ";

        if (frase == null || frase.isBlank()) {
            return null;
        }

        String[] wordsArray = frase.split(EMPTY);
        String palindromos = null;
        for (String word : wordsArray) {
            if (esPalindromo(word)) {
                palindromos = palindromos != null ? palindromos + ", " + word : word;
            }
        }

        return palindromos;
    }

    public static boolean esPalindromo(String word) {
        if (word == null || word.isBlank()) {
            return false;
        }

        char[] wordArray = word.toCharArray();
        char[] copyArray = new char[wordArray.length];
        int index = 0;

        for (int j = wordArray.length - 1; j >= 0; j--) {
            copyArray[index] = wordArray[j];
            index++;
        }
        for (int j = 0; j < wordArray.length; j++) {
            if (wordArray[j] != copyArray[j]) {
                return false;
            }
        }

        return true;
    }


}