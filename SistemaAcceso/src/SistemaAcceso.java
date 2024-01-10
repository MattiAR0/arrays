import java.util.ArrayList;
import java.util.List;

public class SistemaAcceso {
    private List<Usuario> usuariosRegistrados;

    public SistemaAcceso() {

        this.usuariosRegistrados = new ArrayList<>();
        this.usuariosRegistrados.add(new Usuario("admin", "admin123"));
        this.usuariosRegistrados.add(new Usuario("usuario1", "pass123"));
        this.usuariosRegistrados.add(new Usuario("usuario2", "pass456"));

    }

    public boolean validarAcceso(String nick, String contrasena) {
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getNick().equals(nick) && usuario.getContrasena().equals(contrasena)) {
                usuario.actualizarAcceso();
                return true;
            }
        }
        return false;

    }

    public Usuario obtenerUsuarioPorNick(String nick) {
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getNick().equals(nick)) {
                return usuario;
            }
        }
        return null;
    }
}
