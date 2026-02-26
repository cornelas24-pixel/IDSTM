package Main;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
public class Ventana extends JFrame
{
	public Ventana() 
	{
		
		this.setVisible(true);
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("login");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		//contenedor gris (fondo)
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(240,240,240));
		contenedor.setSize(1000,500);
		contenedor.setLayout(null);
		contenedor.setLocation(0,0);
		this.add(contenedor);
		
		// tarjeta dentro de contenedor
		JPanel card = new JPanel();
		card.setLayout(null);
		card.setBackground(Color.white);
		card.setSize(320,400);
		card.setLocation(90,60);
		card.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));
		contenedor.add(card);
		
		//png (logo centrado)
		ImageIcon icon = new ImageIcon("src/Main/images.png");
		JLabel logo = new JLabel(icon);
		logo.setBounds(128,20,64,64);
		card.add(logo);

		
		//titulo login
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(320,40);
		title_login.setLocation(0,95);
		title_login.setFont(new Font("Arial",Font.BOLD,24));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		card.add(title_login);
		
		//ingresar nombre
		JTextField username = new JTextField();
		username.setSize(240,35);
		username.setLocation(40,150);
		username.setBackground(Color.white);
		username.setFont(new Font("Arial",Font.PLAIN,16));
		username.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(200,200,200),1),BorderFactory.createEmptyBorder(5,10,5,10)));
		card.add(username);
		
		//contraseña
		JPasswordField password = new JPasswordField();
		password.setSize(240,35);
		password.setLocation(40,200);
		password.setBackground(Color.white);
		password.setFont(new Font("Arial",Font.PLAIN,16));
		password.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(200,200,200),1),BorderFactory.createEmptyBorder(5,10,5,10)));
		card.add(password);
		
		//boton de acceder
		JButton acceder = new JButton();
		acceder.setSize(240,40);
		acceder.setLocation(40,255);
		acceder.setBackground(new Color(66,133,244));
		acceder.setForeground(Color.white);
		acceder.setFont(new Font("Arial",Font.BOLD,16));
		acceder.setText("Acceder");
		acceder.setBorder(BorderFactory.createLineBorder(new Color(66,133,244),1));
		card.add(acceder);
		
		JCheckBox remember = new JCheckBox();
		remember.setSize(240,20);
		remember.setLocation(40,305);
		remember.setBackground(Color.white);
		remember.setFont(new Font("Arial",Font.PLAIN,13));
		remember.setText("Recuérdame");
		card.add(remember);
		
		//olvido contraseña
		JLabel forgot_pass = new JLabel();
		forgot_pass.setText("¿Olvidaste tu contraseña?");
		forgot_pass.setSize(240,25);
		forgot_pass.setLocation(40,325);
		forgot_pass.setFont(new Font("Arial",Font.PLAIN,13));
		forgot_pass.setForeground(new Color(66,133,244));
		forgot_pass.setHorizontalAlignment(JLabel.CENTER);
		card.add(forgot_pass);
		
		//boton de crear cuenta
		JButton new_account = new JButton();
		new_account.setSize(240,35);
		new_account.setLocation(40,350);
		new_account.setBackground(Color.white);
		new_account.setFont(new Font("Arial",Font.BOLD,14));
		new_account.setText("Crear cuenta");
		new_account.setBorder(BorderFactory.createLineBorder(new Color(200,200,200),1));
		card.add(new_account);
		
		//REGISTER --------------------------------------------------
		
		JPanel register_container = new JPanel();
		register_container.setLayout(null);
		register_container.setBackground(Color.white);
		register_container.setSize(320,400);
		register_container.setLocation(450,60);
		register_container.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));
		contenedor.add(register_container);
		
		//titulo login
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