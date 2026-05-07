package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controllers.HomeController;
import models.AuthModel;

public class AuthView {

    private AuthModel model;
    private HomeController hc;

    public AuthView() {

        model = new AuthModel();
        hc = new HomeController();
    }

    public void loginView() {

        JFrame ventana = new JFrame();

        ventana.setSize(1000, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setMinimumSize(new Dimension(200,200));
        ventana.setMaximumSize(new Dimension(1200,800));
        ventana.setTitle("Login");
        ventana.getContentPane().setBackground(new Color(240,240,240));
        ventana.setLayout(null);

        JPanel contenedor = new JPanel();

        contenedor.setBackground(new Color(240,240,240));
        contenedor.setBounds(0,0,1000,500);
        contenedor.setLayout(null);

        ventana.add(contenedor);

        JPanel card = new JPanel();

        card.setLayout(null);
        card.setBackground(Color.white);
        card.setBounds(90,60,620,400);

        contenedor.add(card);

        JLabel title_login = new JLabel("Bienvenido");

        title_login.setBounds(0,95,320,40);
        title_login.setFont(new Font("Arial",Font.BOLD,24));
        title_login.setHorizontalAlignment(JLabel.CENTER);

        card.add(title_login);

        JTextField username = new JTextField();

        username.setBounds(40,150,240,35);

        card.add(username);

        JPasswordField password = new JPasswordField();

        password.setBounds(40,200,240,35);

        card.add(password);

        JButton acceder = new JButton("Acceder");

        acceder.setBounds(40,255,240,40);
        acceder.setBackground(new Color(66,133,244));
        acceder.setForeground(Color.white);

        card.add(acceder);

        JButton new_account = new JButton("Crear cuenta");

        new_account.setBounds(40,310,240,35);

        card.add(new_account);

        acceder.addActionListener(e -> {

            String user = username.getText();
            String pass = new String(password.getPassword());

            boolean flag1 = false;
            boolean flag2 = false;

            if(user.isEmpty()) {

                username.setBorder(BorderFactory.createLineBorder(Color.RED));

            } else {

                username.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                flag1 = true;
            }

            if(pass.isEmpty()) {

                password.setBorder(BorderFactory.createLineBorder(Color.RED));

            } else {

                password.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                flag2 = true;
            }

            if(flag1 && flag2) {

                if(model.access(user, pass)) {

                    JOptionPane.showMessageDialog(null,"Bienvenido");

                    ventana.dispose();

                    hc.home();

                } else {

                    JOptionPane.showMessageDialog(
                        null,
                        "Usuario o contraseña incorrectos"
                    );
                }
            }
        });

        new_account.addActionListener(e -> {

            ventana.dispose();

            registerView();
        });

        ventana.setVisible(true);
    }

    public void registerView() {

        JFrame ventana = new JFrame();

        ventana.setSize(1000, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setMinimumSize(new Dimension(200,200));
        ventana.setMaximumSize(new Dimension(1200,800));
        ventana.setTitle("Registro");
        ventana.getContentPane().setBackground(new Color(240,240,240));
        ventana.setLayout(null);

        JPanel contenedor = new JPanel();

        contenedor.setOpaque(true);
        contenedor.setBackground(new Color(240,240,240));
        contenedor.setSize(1000,500);
        contenedor.setLayout(null);
        contenedor.setLocation(0,0);

        ventana.add(contenedor);

        JPanel register_container = new JPanel();

        register_container.setLayout(null);
        register_container.setBackground(Color.white);
        register_container.setSize(320,450);
        register_container.setLocation(90,30);

        register_container.setBorder(
            BorderFactory.createLineBorder(
                new Color(220,220,220),1
            )
        );

        contenedor.add(register_container);

        JLabel title_register = new JLabel();

        title_register.setText("Registro");
        title_register.setSize(320,40);
        title_register.setLocation(0,20);
        title_register.setFont(new Font("Arial",Font.BOLD,24));
        title_register.setHorizontalAlignment(JLabel.CENTER);

        register_container.add(title_register);

        JLabel usernameLabel = new JLabel();

        usernameLabel.setText("Nombre de usuario");
        usernameLabel.setSize(320,30);
        usernameLabel.setLocation(0,60);
        usernameLabel.setFont(new Font("Arial",Font.BOLD,12));
        usernameLabel.setHorizontalAlignment(JLabel.CENTER);

        register_container.add(usernameLabel);

        JTextField username_reg = new JTextField();

        username_reg.setBounds(40,90,240,35);

        register_container.add(username_reg);

        JLabel nombreCompletoLabel = new JLabel();

        nombreCompletoLabel.setText("Nombre completo");
        nombreCompletoLabel.setSize(320,30);
        nombreCompletoLabel.setLocation(0,130);
        nombreCompletoLabel.setFont(new Font("Arial",Font.BOLD,12));
        nombreCompletoLabel.setHorizontalAlignment(JLabel.CENTER);

        register_container.add(nombreCompletoLabel);

        JTextField nombreCompleto = new JTextField();

        nombreCompleto.setBounds(40,160,240,35);

        register_container.add(nombreCompleto);

        JLabel passwordLabel = new JLabel();

        passwordLabel.setText("Contraseña");
        passwordLabel.setSize(320,30);
        passwordLabel.setLocation(0,200);
        passwordLabel.setFont(new Font("Arial",Font.BOLD,12));
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);

        register_container.add(passwordLabel);

        JPasswordField passwordRegister = new JPasswordField();

        passwordRegister.setBounds(40,230,240,35);

        register_container.add(passwordRegister);

        JCheckBox dulce = new JCheckBox("Dulce");

        dulce.setBounds(40,280,80,20);
        dulce.setBackground(Color.white);

        register_container.add(dulce);

        JCheckBox salado = new JCheckBox("Salado");

        salado.setBounds(120,280,80,20);
        salado.setBackground(Color.white);

        register_container.add(salado);

        JCheckBox saludable = new JCheckBox("Saludable");

        saludable.setBounds(200,280,90,20);
        saludable.setBackground(Color.white);

        register_container.add(saludable);

        JRadioButton accept_terms = new JRadioButton("Aceptar");

        accept_terms.setBounds(40,310,150,25);
        accept_terms.setOpaque(false);

        register_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazar");

        reject_terms.setBounds(170,310,150,25);
        reject_terms.setOpaque(false);

        register_container.add(reject_terms);

        ButtonGroup group_terms = new ButtonGroup();

        group_terms.add(accept_terms);
        group_terms.add(reject_terms);

        String[] colonias = {
                "Camino Real",
                "Santa Fe",
                "Miramar",
                "Francisco Villa"
        };

        JComboBox<String> comboColonias = new JComboBox<>(colonias);

        comboColonias.setBounds(40,345,240,30);

        register_container.add(comboColonias);

        JButton crearCuenta = new JButton("Crear cuenta");

        crearCuenta.setBounds(40,385,240,35);

        register_container.add(crearCuenta);

        JButton volver = new JButton("Ya tengo cuenta");

        volver.setBounds(40,425,240,25);

        register_container.add(volver);

        crearCuenta.addActionListener(e -> {

            String usernameText = username_reg.getText();
            String nombreText = nombreCompleto.getText();
            String passwordText = new String(passwordRegister.getPassword());

            if(
                usernameText.isEmpty() ||
                nombreText.isEmpty() ||
                passwordText.isEmpty()
            ) {

                JOptionPane.showMessageDialog(
                    null,
                    "Completa todos los campos"
                );

            } else {

                if(model.register(usernameText, passwordText, nombreText)) {

                    JOptionPane.showMessageDialog(
                        null,
                        "Usuario registrado correctamente"
                    );

                    ventana.dispose();

                    loginView();

                } else {

                    JOptionPane.showMessageDialog(
                        null,
                        "Error al registrar usuario"
                    );
                }
            }
        });

        volver.addActionListener(e -> {

            ventana.dispose();

            loginView();
        });

        ventana.setVisible(true);
    }
}