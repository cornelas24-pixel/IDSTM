package Views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class AuthView extends JFrame {

    public JPanel contenedor;
    public JButton acceder, new_account;
    public JTextField username;
    public JPasswordField password;

    public AuthView() {
        setTitle("Login");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }

    public void loginView() {

        contenedor = new JPanel();
        contenedor.setBackground(new Color(240,240,240));
        contenedor.setBounds(0,0,1000,500);
        contenedor.setLayout(null);
        add(contenedor);

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

        username = new JTextField();
        username.setBounds(40,150,240,35);
        card.add(username);

        password = new JPasswordField();
        password.setBounds(40,200,240,35);
        card.add(password);

        acceder = new JButton("Acceder");
        acceder.setBounds(40,255,240,40);
        acceder.setBackground(new Color(66,133,244));
        acceder.setForeground(Color.white);
        card.add(acceder);

        new_account = new JButton("Crear cuenta");
        new_account.setBounds(40,310,240,35);
        card.add(new_account);

        repaint();
        revalidate();
    }

    public void registro() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(240,240,240));
		contenedor.setSize(500,500);
		contenedor.setLayout(null);
		contenedor.setLocation(0,0);
		this.add(contenedor);
		
		JPanel register_container = new JPanel();
		register_container.setLayout(null);
		register_container.setBackground(Color.white);
		register_container.setSize(320,400);
		register_container.setLocation(90,60);
		register_container.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));
		contenedor.add(register_container);
		
		JLabel title_register = new JLabel();
		title_register.setText("Registro");
		title_register.setSize(320,40);
		title_register.setLocation(0,35);
		title_register.setFont(new Font("Arial",Font.BOLD,24));
		title_register.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_register);
		
		JLabel nombre_usuario = new JLabel();
		nombre_usuario.setText("Nombre de usuario");
		nombre_usuario.setSize(320,105);
		nombre_usuario.setLocation(0,35);
		nombre_usuario.setFont(new Font("Arial",Font.BOLD,12));
		nombre_usuario.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(nombre_usuario);
		 
		JTextField username_reg = new JTextField();
		username_reg.setSize(240,35);
		username_reg.setLocation(40,100);
		username_reg.setBackground(Color.white);
		username_reg.setFont(new Font("Arial",Font.PLAIN,16));
		username_reg.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(200,200,200),1),BorderFactory.createEmptyBorder(5,10,5,10)));
		register_container.add(username_reg);
		
		JLabel bio_text = new JLabel();
		bio_text.setText("Biografia");
		bio_text.setSize(320,105);
		bio_text.setLocation(0,100);
		bio_text.setFont(new Font("Arial",Font.BOLD,12));
		bio_text.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(bio_text);
		
		JTextArea bio = new JTextArea();
		bio.setBounds(40,160, 240, 60);
		bio.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(200,200,200),1),BorderFactory.createEmptyBorder(5,10,5,10)));
		register_container.add(bio);
		
		JLabel preference_text = new JLabel();
		preference_text.setText("Preferencias");
		preference_text.setSize(320,105);
		preference_text.setLocation(0,180);
		preference_text.setFont(new Font("Arial",Font.BOLD,12));
		preference_text.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(preference_text);
		
		JCheckBox dulce = new JCheckBox();
		dulce.setSize(80,20);
		dulce.setLocation(40,240);
		dulce.setBackground(Color.white);
		dulce.setFont(new Font("Arial",Font.PLAIN,13));
		dulce.setText("dulce");
		register_container.add(dulce);
		
		JCheckBox salado = new JCheckBox();
		salado.setSize(80,20);
		salado.setLocation(120,240);
		salado.setBackground(Color.white);
		salado.setFont(new Font("Arial",Font.PLAIN,13));
		salado.setText("Salado");
		register_container.add(salado);
		
		JCheckBox saludable = new JCheckBox();
		saludable.setSize(90,20);
		saludable.setLocation(200,240);
		saludable.setBackground(Color.white);
		saludable.setFont(new Font("Arial",Font.PLAIN,13));
		saludable.setText("Saludable");
		register_container.add(saludable);
		
		JLabel terms = new JLabel();
		terms.setText("Preferencias");
		terms.setSize(320,105);
		terms.setLocation(0,180);
		terms.setFont(new Font("Arial",Font.BOLD,12));
		terms.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(terms);
		//Terminos
		JLabel condiciones = new JLabel();
		condiciones.setText("Política de privacidad");
		condiciones.setSize(240,25);
		condiciones.setLocation(40,265);
		condiciones.setFont(new Font("Arial",Font.PLAIN,15));
		condiciones.setForeground(new Color(66,133,244));
		condiciones.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(condiciones);
		
		
		JRadioButton reject_terms = new JRadioButton("Rechazar");
		reject_terms.setBounds(200,282,150,25);
		reject_terms.setOpaque(false);
		register_container.add(reject_terms);
		
		JRadioButton accept_terms = new JRadioButton("Acceptar");
		accept_terms.setBounds(40,282,150,25);
		accept_terms.setOpaque(false);
		register_container.add(accept_terms);
		
		// Grupo excluyente
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
	    comboColonias.setBounds(80, 315, 160, 30);
	    register_container.add(comboColonias);
	    
		JButton new_account2 = new JButton();
		new_account2.setSize(240,35);
		new_account2.setLocation(40,350);
		new_account2.setBackground(Color.white);
		new_account2.setFont(new Font("Arial",Font.BOLD,14));
		new_account2.setText("Crear cuenta");
		new_account2.setBorder(BorderFactory.createLineBorder(new Color(200,200,200),1));
		register_container.add(new_account2);
		
		contenedor.repaint();
		contenedor.revalidate();
    }
}