package Main;

import javax.swing.BorderFactory;
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
		this.setSize(1000,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(400,300));
		this.setTitle("Calculadora");
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		JPanel contenedor = new JPanel();
		contenedor.setBackground(new Color(240,240,240));
		contenedor.setSize(1000,600);
		contenedor.setLayout(null);
		contenedor.setLocation(0,0);
		this.add(contenedor);

		JPanel card = new JPanel();
		card.setLayout(null);
		card.setBackground(Color.white);
		card.setBounds(300,40,400,540);
		card.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));
		contenedor.add(card);

		JLabel titulo = new JLabel("CALCULADORA");
		titulo.setBounds(0,20,400,40);
		titulo.setFont(new Font("Arial",Font.BOLD,26));
		titulo.setHorizontalAlignment(JLabel.CENTER);
		card.add(titulo);

		JTextField pantalla = new JTextField();
		pantalla.setBounds(40,100,320,60);
		pantalla.setFont(new Font("Arial",Font.BOLD,24));
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));
		card.add(pantalla);

		JButton b7 = new JButton("7");
		b7.setBounds(40,190,70,55);
		card.add(b7);

		JButton b8 = new JButton("8");
		b8.setBounds(125,190,70,55);
		card.add(b8);

		JButton b9 = new JButton("9");
		b9.setBounds(210,190,70,55);
		card.add(b9);

		JButton bDiv = new JButton("/");
		bDiv.setBounds(295,190,70,55);
		card.add(bDiv);

		JButton b4 = new JButton("4");
		b4.setBounds(40,260,70,55);
		card.add(b4);

		JButton b5 = new JButton("5");
		b5.setBounds(125,260,70,55);
		card.add(b5);

		JButton b6 = new JButton("6");
		b6.setBounds(210,260,70,55);
		card.add(b6);

		JButton bMul = new JButton("*");
		bMul.setBounds(295,260,70,55);
		card.add(bMul);

		JButton b1 = new JButton("1");
		b1.setBounds(40,330,70,55);
		card.add(b1);

		JButton b2 = new JButton("2");
		b2.setBounds(125,330,70,55);
		card.add(b2);

		JButton b3 = new JButton("3");
		b3.setBounds(210,330,70,55);
		card.add(b3);

		JButton bRes = new JButton("-");
		bRes.setBounds(295,330,70,55);
		card.add(bRes);

		JButton b0 = new JButton("0");
		b0.setBounds(40,400,70,55);
		card.add(b0);

		JButton bPunto = new JButton(".");
		bPunto.setBounds(125,400,70,55);
		card.add(bPunto);

		JButton bIgual = new JButton("=");
		bIgual.setBounds(210,400,70,55);
		card.add(bIgual);

		JButton bSum = new JButton("+");
		bSum.setBounds(295,400,70,55);
		card.add(bSum);

		JButton clear = new JButton("C");
		clear.setBounds(40,470,325,45);
		clear.setBackground(new Color(66,133,244));
		clear.setForeground(Color.white);
		clear.setFont(new Font("Arial",Font.BOLD,14));
		clear.setBorder(BorderFactory.createLineBorder(new Color(66,133,244),1));
		card.add(clear);

		this.setVisible(true);
	}
}