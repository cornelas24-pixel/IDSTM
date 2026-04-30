package Controllers;

import Views.AuthView;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.Color;

public class AuthController {

    public AuthView vista;

    public AuthController() {
        vista = new AuthView();
    }

    public void showLogin() {

        vista.getContentPane().removeAll();
        vista.loginView();

        // Evento botón acceder
        vista.acceder.addActionListener(e -> {
            String user = vista.username.getText();
            String pass = new String(vista.password.getPassword());

            if(user.isEmpty()){
                vista.username.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                vista.username.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }

            if(pass.isEmpty()){
                vista.password.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                vista.password.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            }

            if(!user.isEmpty() && !pass.isEmpty()){
                JOptionPane.showMessageDialog(null,"Bienvenido");
            }
        });

        // Evento cambiar a registro
        vista.new_account.addActionListener(e -> showRegistro());

        vista.setVisible(true);
    }

    public void showRegistro() {
        vista.getContentPane().removeAll();
        vista.registro();
        vista.repaint();
        vista.revalidate();
    }
}