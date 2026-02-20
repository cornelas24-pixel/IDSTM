package Main;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
public class Ventana extends JFrame
{
	public Ventana() 
	{
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("login");
		this.setLocationRelativeTo(null);
		//this.setLocation(200,200);
		this.setBackground(Color.black);
		this.setLayout(null);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(430,400);
		contenedor.setLayout(null);
		contenedor.setLocation(30,30);
		this.add(contenedor);
		
		JLabel title_login = new JLabel();
		title_login.setText("bienvenido");
		title_login.setSize(200,30);
		title_login.setLocation(100,30);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(200,30);
		username.setLocation(100,100);
		username.setLayout(null);
		username.setBackground(Color.white);
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		JButton acceder = new JButton();
		acceder.setSize(200,30);
		acceder.setLocation(100,200);
		acceder.setLayout(null);
		acceder.setBackground(Color.white);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		acceder.setText("acceder");
		contenedor.add(acceder);
		
		
		contenedor.repaint();
		contenedor.revalidate();
	}
}
