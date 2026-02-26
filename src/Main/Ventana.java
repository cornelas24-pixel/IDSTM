package Main;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Ventana extends JFrame
{
	public Ventana() 
	{
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(400,300));
		this.setTitle("Usuarios");
		this.setLocationRelativeTo(null);
		this.setLayout(null);

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
}