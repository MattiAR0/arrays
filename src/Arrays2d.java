import java.util.Arrays;

public class Arrays2d {
    public static void main(String[] args) {
      //  prueba();
        ejer1();
    }

    public static void prueba() {
        int[][] nArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arrayNueva = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepEquals(nArray, arrayNueva));
        System.out.println(Arrays.deepToString(nArray));


        for (int i = 0; i < nArray.length; i++) {
            for (int j = 0; j < nArray[i].length; j++) {
                System.out.print(nArray[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void ejer1() {
        int[][] nArray = new int[4][5];
        int sumaFilas = 0;
        int sumaCol = 0;
        int sumaTotal = 0;

        for (int i = 0; i < nArray.length; i++) {
            for (int j = 0; j < nArray[i].length; j++) {
                nArray[i][j] = (int) (Math.random() * 10);

                sumaFilas += nArray[i][j];
                sumaTotal += nArray[i][j];

                System.out.print(nArray[i][j] + "  ");
            }

            System.out.println("= " + sumaFilas);
            sumaFilas = 0;

        }

        for (int j = 0; j < nArray[0].length; j++) {
            for (int i = 0; i < nArray.length; i++) {
                sumaCol += nArray[i][j];
            }
            System.out.print(sumaCol + " ");
            sumaCol = 0;
        }

        System.out.println(" ST= " + sumaTotal);

    }
}
