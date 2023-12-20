import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea agregar a la agenda? ");
        int numPersonas = scanner.nextInt();
        scanner.nextLine();

        Persona[] agenda = new Persona[numPersonas];

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Persona " + (i + 1) + ": ");
            agenda[i] = nuevaPersona(scanner);

            System.out.print("¿Desea agregar otra persona? (si/no): ");
            String terminar = scanner.nextLine().toLowerCase();
            if (terminar.equals("no")) {
                break;
            }
        }

        imprimirAgenda(agenda);
    }

    private static Persona nuevaPersona(Scanner scanner) {
        Persona persona = new Persona();

        do {
            System.out.print("Apellidos y nombre: ");
            String nombreApellidos = scanner.nextLine();
            if (validarInput(nombreApellidos, "^[A-Za-z]+([ -][A-Za-z]+)*, [A-Za-z]+([ -][A-Za-z]+)*$")) {
                persona.setNombreApellidos(nombreApellidos);
                break;
            } else {
                System.out.println("Formato incorrecto. Pruebe este formato (Apellido1 Apellido 2, Nombre).");
            }
        } while (true);

        do {
            System.out.print("Correo electrónico: ");
            String correo = scanner.nextLine();
            if (validarInput(correo, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                persona.setCorreo(correo);
                break;
            } else {
                System.out.println("Formato incorrecto. Introduzca el correo electrónico en el formato correcto.");
            }
        } while (true);

        do {
            System.out.print("Dirección IP: ");
            String direccionIP = scanner.nextLine();
            if (validarInput(direccionIP, "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")) {
                persona.setDireccionIP(direccionIP);
                break;
            } else {
                System.out.println("Formato incorrecto. Introduzca la dirección IP en el formato correcto.");
            }
        } while (true);

        do {
            System.out.print("Teléfono (debe poner el +34): ");
            String telefono = scanner.nextLine();
            if (validarInput(telefono, "^\\+(34) \\d{9}$")) {
                persona.setTelefono(telefono);
                break;
            } else {
                System.out.println("Formato incorrecto. Introduzca el número de teléfono en el formato correcto.");
            }
        } while (true);

        return persona;
    }

    private static boolean validarInput(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private static void imprimirAgenda(Persona[] agenda) {
        System.out.println("\nAgenda:");
        for (Persona persona : agenda) {
            imprimirPersona(persona);
        }
    }

    private static void imprimirPersona(Persona persona) {
        System.out.println("\nPersona:");
        System.out.println("Nombre y apellidos: " + persona.getNombreApellidos());
        System.out.println("Correo electrónico: " + persona.getCorreo());
        System.out.println("Dirección IP: " + persona.getDireccionIP());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
