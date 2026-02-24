package Main;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
public class Ventana extends JFrame
{
	public Ventana() 
	{
		
		this.setVisible(true);
		this.setSize(500,600);
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
		contenedor.setSize(500,500);
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
		
		contenedor.repaint();
		contenedor.revalidate();
	}
}