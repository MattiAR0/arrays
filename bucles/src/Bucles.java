import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bucles {
    public static void main(String[] args) {
        Sumatorio();
        TablaMultiplicar();
        SerieNum();
    }

    public static void Sumatorio() {
        int numero = 1;
        int suma = 0;

        while (numero <= 10) {
            suma += numero;
            numero++;
        }

        System.out.println("La suma de los números del 1 al 10 es: " + suma);
        suma = 0;

        for (numero = 1; numero <= 10; numero++) {
            suma += numero;
        }

        System.out.println("La suma de los números del 1 al 10 es: " + suma);

        suma = 0;
        numero = 1;
        do {

            suma += numero;
            numero++;
        } while (numero <= 10);

        System.out.println("La suma de los números del 1 al 10 es: " + suma);

    }

    public static void TablaMultiplicar(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar de " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 10) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i++;
        }

         i = 1;
        do {
            System.out.println("Tabla de multiplicar del " + i + ":");
            int j = 1;
            do {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= 10);
    }

    public static void SerieNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la lingitudo de la serie (Tiene que ser mayor que 10)");
        int nLong = sc.nextInt();

        while (nLong < 10){
            System.out.println("La longitud tiene que ser mayor que 10: ");
            nLong = sc.nextInt();
        }

        int num = 1;
        int suma = 0;
        for (int i = 1; i <= nLong; i++){
            if (i < nLong) {
                System.out.print(num + " + ");
            } else {
                System.out.print(num);
            }
            suma += num;
            num += 3;
        }

        System.out.println(" = " + suma);

         num = 1;
         suma = 0;
        int i = 1;
        while (i <= nLong) {
            if (i < nLong) {
                System.out.print(num + " + ");
            } else {
                System.out.print(num);
            }
            suma += num;
            num += 3;
            i++;
        }

        System.out.println(" = " + suma);
         num = 1;
         suma = 0;
         i = 1;
        do {
            if (i < nLong) {
                System.out.print(num + " + ");
            } else {
                System.out.print(num);
            }
            suma += num;
            num += 3;
            i++;
        } while (i <= nLong);

        System.out.println(" = " + suma);
    }


}
