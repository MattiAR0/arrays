import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime el primer número: ");
            int numeroUno = scanner.nextInt();

            System.out.println("Dime el segundo número: ");
            int numeroDos = scanner.nextInt();

            if(numeroUno < 0 || numeroDos < 0){
                System.out.println("Al menos uno de los dos números es negativo.");
                return;
            }


            int a = numeroUno;
            int b = numeroDos;
            while(b != 0){
                int i = b;
                b = a % b;
                a = i;
            }
            int mcm = (numeroUno * numeroDos) / a;

            System.out.println(mcm);
        }
    }

