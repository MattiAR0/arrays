import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class OperacionesConMatrices {

    public static void main(String[] args) {
        // Solicitar al usuario el tamaño de la matriz
        int filas = obtenerEntradaUsuario("Introduce el número de filas: ");
        int columnas = obtenerEntradaUsuario("Introduce el número de columnas: ");

        // Crear la matriz bidimensional e inicializarla con valores aleatorios
        int[][] matriz = crearMatriz(filas, columnas);

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        mostrarMatriz(matriz);

        // Obtener y mostrar el valor máximo y mínimo de la matriz
        int valorMaximo = obtenerValorMaximo(matriz);
        int valorMinimo = obtenerValorMinimo(matriz);
        System.out.println("Valor máximo de la matriz: " + valorMaximo);
        System.out.println("Valor mínimo de la matriz: " + valorMinimo);

        // Sumar cada fila de la matriz
        int[] sumaPorFila = sumarFilas(matriz);
        System.out.println("Suma de cada fila:");
        mostrarArreglo(sumaPorFila);

        // Ordenar los valores de cada fila y mostrar la matriz resultante
        ordenarValoresPorFila(matriz);
        System.out.println("Matriz después de ordenar cada fila:");
        mostrarMatriz(matriz);

        // Sumar de nuevo cada fila de la matriz ordenada
        int[] sumaPorFilaOrdenada = sumarFilas(matriz);
        System.out.println("Suma de cada fila después de ordenar:");
        mostrarArreglo(sumaPorFilaOrdenada);

        // Reordenar las filas de la matriz en función de la suma de fila
        reordenarFilasPorSuma(matriz);
        System.out.println("Matriz reordenada por suma de fila:");
        mostrarMatriz(matriz);

        // Sumar todos los elementos de la matriz
        int sumaTotal = sumarMatriz(matriz);
        System.out.println("Suma total de la matriz: " + sumaTotal);
    }

    // Método para obtener entrada de usuario
    private static int obtenerEntradaUsuario(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    // Método para crear y rellenar una matriz con valores aleatorios
    private static int[][] crearMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(501) - 250;  // Valores entre -250 y 250
            }
        }

        return matriz;
    }

    // Método para mostrar una matriz
    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    // Método para obtener el valor máximo de la matriz
    private static int obtenerValorMaximo(int[][] matriz) {
        int maximo = Integer.MIN_VALUE;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor > maximo) {
                    maximo = valor;
                }
            }
        }
        return maximo;
    }

    private static int obtenerValorMinimo(int[][] matriz) {
        int minimo = Integer.MAX_VALUE;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor < minimo) {
                    minimo = valor;
                }
            }
        }
        return minimo;
    }

    private static int[] sumarFilas(int[][] matriz) {
        int[] sumaPorFila = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int valor : matriz[i]) {
                sumaPorFila[i] += valor;
            }
        }
        return sumaPorFila;
    }

    private static void ordenarValoresPorFila(int[][] matriz) {
        for (int[] fila : matriz) {
            Arrays.sort(fila);
        }
    }

    private static void reordenarFilasPorSuma(int[][] matriz) {
        Arrays.sort(matriz, (fila1, fila2) -> {
            int sumaFila1 = Arrays.stream(fila1).sum();
            int sumaFila2 = Arrays.stream(fila2).sum();
            return Integer.compare(sumaFila1, sumaFila2);
        });
    }

    private static int sumarMatriz(int[][] matriz) {
        int sumaTotal = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                sumaTotal += valor;
            }
        }
        return sumaTotal;
    }


    // Método para mostrar un arreglo
    private static void mostrarArreglo(int[] arreglo) {
        for (int valor : arreglo) {
            System.out.print(valor + "\t");
        }
        System.out.println();
    }
}
