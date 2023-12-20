import java.util.Scanner;

public class Maraton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();

        if (edad >= 18){

            System.out.println("Ha participado anteriormente en otra maraton?");
            String haParticipado = sc.next();

            if (haParticipado.equalsIgnoreCase("si")){
                System.out.println("Introduce el tiempo de la anterior maraton (minutos): ");
                int tiempo = sc.nextInt();

                if (edad < 35 && tiempo < 190){
                    System.out.println("Persona seleccionada");
                } else if (edad >= 35 && tiempo < 225) {
                    System.out.println("Persona seleccionada");
                } else {
                    System.out.println("Persona no seleccionada");
                }
            } else{
                System.out.println("Persona no seleccionada");
            }
        } else {
            System.out.println("No puede participar");
        }

    }
}