import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaAcceso sistema = new SistemaAcceso();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nick: ");
        String nickIngresado = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scanner.nextLine();



        if (sistema.validarAcceso(nickIngresado, contrasenaIngresada)) {
            Usuario usuario = sistema.obtenerUsuarioPorNick(nickIngresado);
            System.out.println("¡Acceso concedido! Último acceso: " + usuario.getUltimoAcceso() +
                    ", Número de accesos: " + usuario.getNumeroAccesos());
        } else {
            System.out.println("Acceso denegado. Verifique su nick y contraseña.");
        }
    }



    }
