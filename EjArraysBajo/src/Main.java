import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cantantes();
        tablaMultiplicar();
    }

    private static void cantantes() {
        Scanner sc = new Scanner(System.in);

        final int MAX_SIZE = 10;
        final String FIN = "fin";

        String[] cantantes = new String[MAX_SIZE];
        int index = 0;

        System.out.println("Introduce hasta 10 cantantes que te gusten mucho. Si deseas terminar antes escribe " +
                "'fin'.");

        while (index < MAX_SIZE) {
            System.out.println("Número " + (index + 1) + ": ");
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase(FIN)) {
                break;
            }

            cantantes[index] = texto;
            index++;
        }

        if(index != 0) {
            System.out.print("Estos son tus grupos favoritos: ");
            for (int i = 0; i < index; i++) {
                System.out.print(cantantes[i].toUpperCase() + ", ");
            }
        }
        sc.close();
    }

    private static void tablaMultiplicar() {
        int[][] tablas = new int[10][10];
        for (int i = 0; i < tablas.length; i++){
            for (int j = 0; j < tablas[i].length; j++){
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < tablas.length; i++){
            System.out.println("Tabla del " + (i + 1) + ":");
            for (int j = 0; j < tablas[i].length; j++){
                System.out.println((i + 1) + " x " + (j + 1) + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }


}
