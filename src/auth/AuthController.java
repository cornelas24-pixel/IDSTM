package auth;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthController {
    private AuthView view;
    private AuthModel model;

    public AuthController(AuthView view, AuthModel model) {
        this.view = view;
        this.model = model;

        // Añadir el listener al botón de iniciar sesión
        this.view.getBtnLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autenticarUsuario();
            }
        });
    }

    public void iniciar() {
        view.setVisible(true);
    }

    private void autenticarUsuario() {
        String username = view.getUsername();
        String password = view.getPassword();

        // Validar con el modelo
        boolean isValid = model.autenticar(username, password);

        // Mostrar resultado en la vista
        if (isValid) {
            view.showMessage("¡Inicio de sesión exitoso!", false);
        } else {
            view.showMessage("Usuario o contraseña incorrectos.", true);
        }
    }

    // Método main para probar la arquitectura MVC independientemente
    public static void main(String[] args) {
        AuthView view = new AuthView();
        AuthModel model = new AuthModel();
        AuthController controller = new AuthController(view, model);
        
        controller.iniciar();
    }
}
