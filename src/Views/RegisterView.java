package Views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controllers.UserController;
import models.User;

public class RegisterView {

    private UsersView usersView;

    public RegisterView(UsersView usersView) {

        this.usersView = usersView;
    }

    public void showRegister() {

        JFrame ventana = new JFrame();

        ventana.setSize(400,400);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        JPanel panel = new JPanel();

        panel.setLayout(null);
        panel.setBounds(0,0,400,400);
        panel.setBackground(Color.WHITE);

        ventana.add(panel);

        JLabel title = new JLabel("Registrar usuario");

        title.setBounds(90,20,250,40);
        title.setFont(new Font("Arial",Font.BOLD,22));

        panel.add(title);

        JLabel usernameLabel = new JLabel("Username");

        usernameLabel.setBounds(40,80,200,20);

        panel.add(usernameLabel);

        JTextField username = new JTextField();

        username.setBounds(40,105,300,35);

        panel.add(username);

        JLabel passwordLabel = new JLabel("Password");

        passwordLabel.setBounds(40,150,200,20);

        panel.add(passwordLabel);

        JPasswordField password = new JPasswordField();

        password.setBounds(40,175,300,35);

        panel.add(password);

        JLabel nombreLabel = new JLabel("Nombre completo");

        nombreLabel.setBounds(40,220,200,20);

        panel.add(nombreLabel);

        JTextField nombre = new JTextField();

        nombre.setBounds(40,245,300,35);

        panel.add(nombre);

        JButton guardar = new JButton("Guardar");

        guardar.setBounds(40,300,140,35);

        panel.add(guardar);

        JButton cancelar = new JButton("Cancelar");

        cancelar.setBounds(200,300,140,35);

        panel.add(cancelar);

        guardar.addActionListener(e -> {

            String user = username.getText();
            String pass = new String(password.getPassword());
            String nombreCompleto = nombre.getText();

            if(
                user.isEmpty() ||
                pass.isEmpty() ||
                nombreCompleto.isEmpty()
            ) {

                JOptionPane.showMessageDialog(
                    null,
                    "Completa todos los campos"
                );

            } else {

                User nuevoUsuario = new User(
                    user,
                    pass,
                    nombreCompleto
                );

                UserController uc = new UserController();

                if(uc.registrarUsuario(nuevoUsuario)) {

                    JOptionPane.showMessageDialog(
                        null,
                        "Usuario registrado"
                    );

                    usersView.cargarTabla();

                    ventana.dispose();

                } else {

                    JOptionPane.showMessageDialog(
                        null,
                        "Error al registrar"
                    );
                }
            }
        });

        cancelar.addActionListener(e -> {

            ventana.dispose();
        });

        ventana.setVisible(true);
    }
}