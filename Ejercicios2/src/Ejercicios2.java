import java.util.Scanner;
public class Ejercicios2 {
    public static void main(String[] args) {
        NumerosPares();
        Eco();
        SumaParesCondicional();
        SumaParesSinCondicional();
    }

    public static void NumerosPares(){
        System.out.println("--Incremento 2 en 2--");
        for (int i = 10; i <= 20; i += 2) {
            if (i == 16) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--Incremento 1 en 1--");
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0 && i != 16) {
                System.out.println(i);
            }
        }

        System.out.println("--Bucle infinito--");
        int i = 10;
        while (true) {
            if (i % 2 == 0) {
                if (i == 16) {
                    i++;
                    continue;
                }
                System.out.println(i);
            }
            i++;
            if (i > 20) {
                break;
            }
        }
    }

    public static void Eco(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe algo (o 'salir' para finalizar):");

        while (true) {
            String sc = scanner.nextLine();
            if (sc.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa.");
                break;
            } else {
                System.out.println("Eco: " + sc);
            }
        }


    }

    public static void SumaParesCondicional(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Con estructuras condicionales");

        System.out.print("Introduce el límite inferior: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Introduce el límite superior: ");
        int limiteSuperior = scanner.nextInt();

        int sumaPares = 0;

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }

        System.out.println("La suma de los números pares en el rango es: " + sumaPares);
    }

    public static void SumaParesSinCondicional(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Sin estructuras condicionales");

        System.out.print("Introduce el límite inferior: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Introduce el límite superior: ");
        int limiteSuperior = scanner.nextInt();

        // Asegura que el límite inferior sea par
        if (limiteInferior % 2 != 0) {
            limiteInferior++;
        }

        int sumaPares = 0;

        for (int i = limiteInferior; i <= limiteSuperior; i += 2) {
            sumaPares += i;
        }

        System.out.println("La suma de los números pares en el rango es: " + sumaPares);

        scanner.close();


    }



    }
