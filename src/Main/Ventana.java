package Main;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
public class Ventana extends JFrame{
	public Ventana() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("hola");
		this.setLocationRelativeTo(null);
		//this.setLocation(200,200);
		this.setBackground(Color.black);
	}
}
