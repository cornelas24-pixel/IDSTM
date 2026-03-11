package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	private ButtonGroup buttonGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setTitle("Registro de Usuarios"); //$NON-NLS-1$
		frame.setBounds(100, 50, 850, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Registro de Usuarios");
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 10, 10));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 2, 5, 5));

		panel_1.add(new JLabel("Nombres:"));
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);

		panel_1.add(new JLabel("Apellido Paterno:")); 
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		panel_1.add(new JLabel("Apellido Materno:")); 
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		panel_1.add(new JLabel("Fecha Nacimiento:")); 
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		panel_1.add(new JLabel("Sexo:"));

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_1.add(panel_2);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino"); 
		panel_2.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		panel_2.add(rdbtnNewRadioButton_1);

		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);

		panel_1.add(new JLabel("Nacionalidad:"));

		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Perú");
		comboBox.addItem("Chile");
		comboBox.addItem("Argentina"); 
		panel_1.add(comboBox);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Perfil del Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/Main/user.png")));
		panel_3.add(lblNewLabel_1, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(new GridLayout(2, 1));
		panel_3.add(panel_4, BorderLayout.SOUTH);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		panel_4.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha Nacimiento"); 
		panel_4.add(chckbxNewCheckBox_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Datos Opcionales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 2));

		JScrollPane scrollPane = new JScrollPane();
		panel_5.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JScrollPane scrollPane_1 = new JScrollPane();
		panel_5.add(scrollPane_1);

		JList list = new JList(new String[] {"Cantar", "Escuchar Música", "Leer", "Deportes", "Otros"});
		scrollPane_1.setViewportView(list);

		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 1, 10, 10));

		JButton btnNewButton = new JButton("Nuevo");
		panel_6.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Guardar");
		panel_6.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Salir");
		panel_6.add(btnNewButton_2);
	}
}