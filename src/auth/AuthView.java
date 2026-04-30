package auth;

import javax.swing.*;
import java.awt.*;

public class AuthView extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JLabel lblMessage;

    public AuthView() {
        setTitle("Login");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10));

        JPanel userPanel = new JPanel();
        userPanel.add(new JLabel("Usuario:"));
        txtUsername = new JTextField(15);
        userPanel.add(txtUsername);

        JPanel passPanel = new JPanel();
        passPanel.add(new JLabel("Contraseña:"));
        txtPassword = new JPasswordField(15);
        passPanel.add(txtPassword);

        JPanel btnPanel = new JPanel();
        btnLogin = new JButton("Iniciar sesión");
        btnPanel.add(btnLogin);

        JPanel msgPanel = new JPanel();
        lblMessage = new JLabel("");
        msgPanel.add(lblMessage);

        add(userPanel);
        add(passPanel);
        add(btnPanel);
        add(msgPanel);
    }

    public String getUsername() {
        return txtUsername.getText();
    }

    public String getPassword() {
        return new String(txtPassword.getPassword());
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void showMessage(String message, boolean isError) {
        lblMessage.setText(message);
        if (isError) {
            lblMessage.setForeground(Color.RED);
        } else {
            lblMessage.setForeground(new Color(0, 128, 0)); // Dark green for success
        }
    }
}
