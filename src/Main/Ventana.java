package Main;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame
{
	public Ventana() 
	{
		this.setSize(1000,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(400,300));
		this.setTitle("Calculadora");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		Image icono = new ImageIcon(getClass().getResource("iconoizq.png")).getImage();
		this.setIconImage(icono);
		
		JMenuBar barra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem open = new JMenuItem("Abrir");
		JMenuItem close = new JMenuItem("Cerrar");
		JMenuItem save = new JMenuItem("Guardar");
		JMenuItem newFile = new JMenuItem("Nuevo");
		
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newFile);
		barra.add(archivo);
		
		JMenu submenu = new JMenu("Otros");
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("An item in the submenu");
		submenu.add(menuItem);
		
		menuItem = new JMenuItem("Another Item");
		submenu.add(menuItem);
		archivo.add(submenu);
		
		//this.setJMenuBar(barra);
		
		barra.add(archivo);
		
		//abrir pestañas
		this.login();

		

		this.setVisible(true);
	}
	public void login()
	{

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
		card.setSize(620,400);
		card.setLocation(90,60);
		card.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));
		contenedor.add(card);
		
		ImageIcon icon3 = new ImageIcon("src/Main/waves.png");
		//escalar imagen a la resolución que quiera
		Image img2 = icon3.getImage();
		Image imgScaled2 = img2.getScaledInstance(350, 150, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2 = new ImageIcon(imgScaled2);

		JLabel wave = new JLabel(scaledIcon2);
		wave.setBounds(275, -42, 350, 150);
		card.add(wave);
		
		
		//logo principal
		ImageIcon marca = new ImageIcon("src/Main/logo.png");
		//escalar imagen a la resolución que quiera
		Image img3 = marca.getImage();
		Image imgScaled3 = img3.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon3 = new ImageIcon(imgScaled3);
		
		JLabel principal = new JLabel(scaledIcon3);
		principal.setBounds(350, 100, 200, 200);
		card.add(principal);
		
		
		ImageIcon key = new ImageIcon("src/Main/key.png");
		//escalar imagen a la resolución que quiera
		Image img4 = key.getImage();
		Image imgScaled4 = img4.getScaledInstance(45, 20, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon4 = new ImageIcon(imgScaled4);
		
		JLabel passkey = new JLabel(scaledIcon4);
		passkey.setBounds(218, 208, 45, 20);
		card.add(passkey);
		
		ImageIcon user = new ImageIcon("src/Main/user.png");
		//escalar imagen a la resolución que quiera
		Image img5 = user.getImage();
		Image imgScaled5 = img5.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon5 = new ImageIcon(imgScaled5);
		
		JLabel userkey = new JLabel(scaledIcon5);
		userkey.setBounds(225, 142, 50, 50);
		card.add(userkey);
		
		ImageIcon icon2 = new ImageIcon("src/Main/waves2.png");
		Image img = icon2.getImage();
		Image imgScaled = img.getScaledInstance(350, 150, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScaled);

		JLabel wave2 = new JLabel(scaledIcon);
		wave2.setBounds(275, 290, 350, 150);
		card.add(wave2);
		//png
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
		username.setOpaque(false);
		username.setBackground(Color.white);
		username.setFont(new Font("Arial",Font.PLAIN,16));
		username.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(200,200,200),1),
				BorderFactory.createEmptyBorder(5,10,5,10)
		));
		card.add(username);
		
		//contraseña
		JPasswordField password = new JPasswordField();
		password.setSize(240,35);
		password.setLocation(40,200);
		password.setBackground(Color.white);
		password.setOpaque(false);
		password.setFont(new Font("Arial",Font.PLAIN,16));
		password.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(200,200,200),1),
				BorderFactory.createEmptyBorder(5,10,5,10)
		));
		card.add(password);
		
		//boton de acceder (botón principal azul)
		JButton acceder = new JButton();
		acceder.setSize(240,40);
		acceder.setLocation(40,255);
		acceder.setBackground(new Color(66,133,244));
		acceder.setForeground(Color.white);
		acceder.setFont(new Font("Arial",Font.BOLD,16));
		acceder.setText("Acceder");
		acceder.setBorder(BorderFactory.createLineBorder(new Color(66,133,244),1));
		card.add(acceder);
		
		acceder.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String Username_val = username.getText();
				String password_val = new String(password.getPassword());
				if (Username_val.isEmpty()) {
				    username.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
				} else {
				    username.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
				}
				if (password_val.isEmpty()) {
				    password.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
				} else {
				    password.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
				}

				if (!Username_val.isEmpty() && !password_val.isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Bienvenido.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		
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
		
		//boton de crear cuenta (secundario minimalista)
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
	
	public void registro()
	{
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
	public void users()
	{
		// fondo
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(240,240,240));
		contenedor.setSize(1000,600);
		contenedor.setLayout(null);
		contenedor.setLocation(0,0);
		this.add(contenedor);

		// tarjeta principal de tabla
		JPanel card_tabla = new JPanel();
		card_tabla.setLayout(null);
		card_tabla.setBackground(Color.white);
		card_tabla.setBounds(50,40,900,500);
		card_tabla.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));
		contenedor.add(card_tabla);

		// titulo
		JLabel titulo = new JLabel("USUARIOS");
		titulo.setBounds(0,20,900,40);
		titulo.setFont(new Font("Arial",Font.BOLD,26));
		titulo.setHorizontalAlignment(JLabel.CENTER);
		card_tabla.add(titulo);

		// subtitulo
		JLabel subtitulo = new JLabel("Registros de usuarios del sistema");
		subtitulo.setBounds(0,55,900,25);
		subtitulo.setFont(new Font("Arial",Font.PLAIN,14));
		subtitulo.setForeground(new Color(120,120,120));
		subtitulo.setHorizontalAlignment(JLabel.CENTER);
		card_tabla.add(subtitulo);

		// BOTONES
		JButton exportar = new JButton("Exportar");
		exportar.setBounds(650,100,110,35);
		exportar.setBackground(Color.white);
		exportar.setFont(new Font("Arial",Font.BOLD,14));
		exportar.setBorder(BorderFactory.createLineBorder(new Color(200,200,200),1));
		card_tabla.add(exportar);

		JButton anadir = new JButton("Añadir");
		anadir.setBounds(770,100,110,35);
		anadir.setBackground(new Color(66,133,244));
		anadir.setForeground(Color.white);
		anadir.setFont(new Font("Arial",Font.BOLD,14));
		anadir.setBorder(BorderFactory.createLineBorder(new Color(66,133,244),1));
		card_tabla.add(anadir);

		// columnas
		String[] columnas = {
			"ID",
			"Nombre",
			"Correo electrónico",
			"Edad",
			"Estado"
		};

		// datos
		Object[][] datos = {
				{"001","Carlos López","carlos@gmail.com","20","Activo"},
				{"002","Ana Torres","ana@gmail.com","22","Activo"},
				{"003","Luis Pérez","luis@gmail.com","19","Inactivo"},
				{"004","María Gómez","maria@gmail.com","21","Activo"},
				{"005","Jorge Ruiz","jorge@gmail.com","23","Inactivo"},
				{"006","Sofía Díaz","sofia@gmail.com","20","Activo"},
				{"007","Pedro Sánchez","pedro@gmail.com","24","Activo"},
				{"008","Elena Castro","elena@gmail.com","22","Inactivo"},
				{"009","Laura Méndez","laura@gmail.com","25","Activo"},
				{"010","Diego Ramos","diego@gmail.com","18","Inactivo"},
				{"011","Fernanda Ortiz","fernanda@gmail.com","21","Activo"},
				{"012","Ricardo Vega","ricardo@gmail.com","26","Activo"},
				{"013","Camila Navarro","camila@gmail.com","19","Inactivo"},
				{"014","Andrés Morales","andres@gmail.com","23","Activo"},
				{"015","Valeria Rojas","valeria@gmail.com","20","Activo"},
				{"016","Miguel Herrera","miguel@gmail.com","27","Inactivo"},
				{"017","Daniela Cruz","daniela@gmail.com","22","Activo"},
				{"018","José Castillo","jose@gmail.com","24","Activo"},
				{"019","Paula Vargas","paula@gmail.com","18","Inactivo"},
				{"020","Alejandro Paredes","alejandro@gmail.com","25","Activo"},
				{"021","Lucía Romero","lucia@gmail.com","21","Activo"},
				{"022","Hugo Salazar","hugo@gmail.com","28","Inactivo"},
				{"023","Natalia Flores","natalia@gmail.com","20","Activo"},
				{"024","Sergio Medina","sergio@gmail.com","26","Activo"},
				{"025","Patricia León","patricia@gmail.com","23","Inactivo"},
				{"026","Gabriel Peña","gabriel@gmail.com","22","Activo"},
				{"027","Mariana Silva","mariana@gmail.com","19","Activo"},
				{"028","Iván Delgado","ivan@gmail.com","24","Inactivo"},
				{"029","Carolina Campos","carolina@gmail.com","27","Activo"},
				{"030","Emilio Fuentes","emilio@gmail.com","21","Activo"}
			};
		// MODELO (solo visual, no editable)
		DefaultTableModel modelo = new DefaultTableModel(datos, columnas) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		// TABLA
		JTable tabla = new JTable(modelo);
		tabla.setBounds(40,150,820,300);
		tabla.setFont(new Font("Arial",Font.PLAIN,13));
		tabla.setRowHeight(25);
		tabla.setGridColor(new Color(230,230,230));
		tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); // columnas redimensionables

		// encabezado
		tabla.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
		tabla.getTableHeader().setBackground(new Color(245,245,245));
		tabla.getTableHeader().setBorder(
			BorderFactory.createLineBorder(new Color(220,220,220),1)
		);

		// scrollpane
		JScrollPane scroll_tabla = new JScrollPane(tabla);
		scroll_tabla.setBounds(40,150,820,300);
		scroll_tabla.setBorder(
			BorderFactory.createLineBorder(new Color(220,220,220),1)
		);
		card_tabla.add(scroll_tabla);

		contenedor.repaint();
		contenedor.revalidate();
		this.setVisible(true);
	}
	public void test()
	{
		JPanel calculadora = new JPanel();
		calculadora.setSize(320,420);
		calculadora.setLocation(330,80);
		calculadora.setBackground(new Color(230,230,230));
		calculadora.setLayout(new BorderLayout(10,10));
		this.add(calculadora);

		// pantalla
		JTextField pantalla = new JTextField();
		pantalla.setFont(new Font("Arial",Font.BOLD,28));
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		pantalla.setBackground(Color.white);
		calculadora.add(pantalla,BorderLayout.NORTH);

		// panel botones
		JPanel botones = new JPanel();
		GridLayout mi_layout = new GridLayout(5,4);
		mi_layout.setVgap(203);
		mi_layout.setHgap(230);
		botones.setLayout(mi_layout);
		botones.setBackground(new Color(230,230,230));

		// fila 1
		botones.add(new JButton("C"));
		botones.add(new JButton("+/-"));
		botones.add(new JButton("%"));
		botones.add(new JButton("/"));

		// fila 2
		botones.add(new JButton("7"));
		botones.add(new JButton("8"));
		botones.add(new JButton("9"));
		botones.add(new JButton("x"));

		// fila 3
		botones.add(new JButton("4"));
		botones.add(new JButton("5"));
		botones.add(new JButton("6"));
		botones.add(new JButton("-"));

		// fila 4
		botones.add(new JButton("1"));
		botones.add(new JButton("2"));
		botones.add(new JButton("3"));
		botones.add(new JButton("+"));

		// fila 5
		botones.add(new JButton("0"));
		botones.add(new JButton("."));
		botones.add(new JButton("="));
		botones.add(new JButton(""));

		calculadora.add(botones,BorderLayout.CENTER);
	}
	public void interes() 
	{
		JPanel calculadora = new JPanel();
		calculadora.setSize(320,420);
		calculadora.setLocation(330,80);
		calculadora.setBackground(new Color(230,230,230));
		calculadora.setLayout(new BorderLayout(50,50));
		this.add(calculadora);
		
		JLabel title = new JLabel("INTERES");
		title.setFont(new Font("Arial",Font.BOLD,28));
		title.setBackground(new Color(230,230,230));
		calculadora.add(title,BorderLayout.NORTH);
		
		// panel botones
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(0,2));
		botones.setBackground(new Color(230,230,230));

		// fila 1
		botones.add(new JLabel("capital"));
		botones.add(new JTextField());
		botones.add(new JLabel("tiempo"));
		botones.add(new JTextField());
		botones.add(new JLabel("tasa interes"));
		botones.add(new JTextField());
		botones.add(new JButton("calcular"));
		botones.add(new JButton("cancelar"));

		calculadora.add(botones,BorderLayout.CENTER);
		
		JPanel inferior = new JPanel();
		inferior.setLayout(new GridLayout(0,2));
		inferior.setBackground(new Color(230,230,230));

		// fila 1
		inferior.add(new JLabel("Interes:"));
		inferior.add(new JTextField());
		inferior.add(new JLabel("Monto:"));
		inferior.add(new JTextField());
		
		calculadora.add(inferior,BorderLayout.SOUTH);
		
	}
	public void dibujo()
	{
		JPanel panel = new JPanel()
		{
			protected void paintComponent(java.awt.Graphics g)
			{
				super.paintComponent(g);

				g.setColor(new Color(30,170,220));
				g.fillRect(0,0,1000,620);

				g.setColor(new Color(120,90,60));
				g.fillRect(0,350,1000,300);

				g.setColor(new Color(240,200,100));
				g.fillRect(380,250,220,150);

				int x1[] = {360,490,620};
				int y1[] = {250,160,250};
				g.setColor(Color.RED);
				g.fillPolygon(x1,y1,3);

				g.setColor(new Color(140,90,20));
				g.fillRect(420,290,60,110);

				g.setColor(Color.WHITE);
				g.fillOval(470,340,8,8);

				g.setColor(Color.WHITE);
				g.fillRect(510,290,70,70);

				g.setColor(Color.RED);
				g.drawLine(545,290,545,360);
				g.drawLine(510,325,580,325);

				g.setColor(Color.GRAY);
				g.fillRect(540,180,25,60);
				g.fillRect(530,170,45,15);

				g.setColor(new Color(255,180,70));

				g.fillRect(250,350,20,60);
				g.fillRect(280,350,20,60);
				g.fillRect(310,350,20,60);
				g.fillRect(340,350,20,60);
				g.fillRect(370,350,20,60);
				g.fillRect(400,350,20,60);

				int c1x[] = {250,260,270};
				int c1y[] = {350,330,350};
				g.fillPolygon(c1x,c1y,3);

				int c2x[] = {280,290,300};
				int c2y[] = {350,330,350};
				g.fillPolygon(c2x,c2y,3);

				int c3x[] = {310,320,330};
				int c3y[] = {350,330,350};
				g.fillPolygon(c3x,c3y,3);

				int c4x[] = {340,350,360};
				int c4y[] = {350,330,350};
				g.fillPolygon(c4x,c4y,3);

				int c5x[] = {370,380,390};
				int c5y[] = {350,330,350};
				g.fillPolygon(c5x,c5y,3);

				int c6x[] = {400,410,420};
				int c6y[] = {350,330,350};
				g.fillPolygon(c6x,c6y,3);
			}
		};

		panel.setBounds(0,0,1000,620);
		panel.setOpaque(false);
		this.add(panel);

		this.repaint();
		this.revalidate();
	}
}