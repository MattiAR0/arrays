public class Usuario {
    private String nick;
    private String contrasena;
    private String ultimoAcceso;
    private int numeroAccesos;

    public Usuario(String nick, String contrasena) {
        this.nick = nick;
        this.contrasena = contrasena;
        this.ultimoAcceso = null;
        this.numeroAccesos = 0;
    }

    public String getNick() {
        return nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getUltimoAcceso() {
        return ultimoAcceso;
    }

    public int getNumeroAccesos() {
        return numeroAccesos;
    }

    public void actualizarAcceso() {
        this.ultimoAcceso = java.time.LocalDateTime.now().toString();
        this.numeroAccesos++;
    }
}
