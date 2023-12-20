import java.util.Scanner;

public class EjTernarios {
    public static void main(String[] args) {
        DiasSemana();
        CalificacionExamen();
    }

    public static void DiasSemana() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero entre 1 y 7");
        int numDia = sc.nextInt();

        String nombreDia = (numDia >= 1 && numDia <= 7) ?
                (numDia == 1 ? "Lunes" :
                        numDia == 2 ? "Martes" :
                                numDia == 3 ? "Miércoles" :
                                        numDia == 4 ? "Jueves" :
                                                numDia == 5 ? "Viernes" :
                                                        numDia == 6 ? "Sábado" : "Domingo")
                : "Día no válido";

    }

    public static void CalificacionExamen() {
        Scanner sc = new Scanner(System.in);
        int puntuacion = 0;

        do {
            System.out.println("Introduce la nota del examen entre 0 y 100: ");
            puntuacion = sc.nextInt();
        } while (puntuacion < 0 || puntuacion > 100);

        String calificacion = (puntuacion >= 90 && puntuacion <= 100) ? "A" :
                (puntuacion >= 80 && puntuacion <= 89) ? "B" :
                        (puntuacion >= 70 && puntuacion <= 79) ? "C" :
                                (puntuacion >= 60 && puntuacion <= 69) ? "D" : "F";

        System.out.println("Puntuación: " + puntuacion + " => Calificación: " + calificacion);
    }
    }
