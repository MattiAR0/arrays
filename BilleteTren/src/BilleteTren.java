import java.util.Scanner;

public class BilleteTren {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("¿Es un billete de ida y vuelta? (Si/No): ");
        String tipoBillete = scanner.next();

        System.out.print("¿Tiene la tarjeta Interrail? (Si/No): ");
        String tarjetaInterrail = scanner.next();

        double precioPorKilometro;

        if (tipoBillete.equalsIgnoreCase("Si")) {
            precioPorKilometro = 0.26;
        } else {
            precioPorKilometro = 0.33;
        }

        double precioTotal = distancia * precioPorKilometro;

        if (tarjetaInterrail.equalsIgnoreCase("Si")) {
            precioTotal *= 0.75;
        } else {
            if (precioTotal > 110) {
                precioTotal *= 0.9;
            } else if (precioTotal > 50) {
                precioTotal *= 0.95;
            }
        }

        System.out.printf("El precio del billete es: %.2f", precioTotal);
    }
}

