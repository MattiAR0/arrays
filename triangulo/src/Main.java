import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del triangulo");
        int lado = sc.nextInt();

        while (lado <= 0){
           System.out.println("Introduce la longitud del triangulo");
           lado = sc.nextInt();
        }

        for (int i = 0; i < lado; i++){
            for (int j = 0; j < i + 1; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}