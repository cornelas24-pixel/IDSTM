package auth;

public class AuthModel {
    public boolean autenticar(String usuario, String contrasena) {
        return "admin".equals(usuario) && "1234".equals(contrasena);
    }
}
