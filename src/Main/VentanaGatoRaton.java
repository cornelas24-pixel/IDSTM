package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;

import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BotonGato extends JButton
{
    int fila;
    int columna;
    String estado;

    public BotonGato(int fila, int columna)
    {
        this.fila = fila;
        this.columna = columna;
        this.estado = "";

        this.setFont(new Font("Arial", Font.BOLD, 40));
        this.setFocusPainted(false);
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createLineBorder(new Color(210,210,210),1));
    }
}

public class VentanaGatoRaton extends JFrame
{
    JPanel contenedor;
    JPanel card;
    JPanel tableroPanel;

    JLabel jugadorX;
    JLabel jugadorO;
    JLabel turnoLabel;

    BotonGato botones[][];
    String tablero[][];

    String turno;

    int puntosX;
    int puntosO;

    JButton reiniciar;

    public VentanaGatoRaton()
    {
        this.setTitle("Tic Tac Toe");
        this.setSize(520,650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(400,500));
        this.setLayout(null);

        puntosX = 0;
        puntosO = 0;
        turno = "X";

        botones = new BotonGato[3][3];
        tablero = new String[3][3];

        interfaz();

        this.setVisible(true);
    }

    public void interfaz()
    {
        contenedor = new JPanel();
        contenedor.setLayout(null);
        contenedor.setBounds(0,0,520,650);
        contenedor.setBackground(new Color(240,240,240));
        this.add(contenedor);

        card = new JPanel();
        card.setLayout(null);
        card.setBounds(45,35,410,540);
        card.setBackground(Color.white);
        card.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));
        contenedor.add(card);

        JLabel titulo = new JLabel("TIC TAC TOE");
        titulo.setBounds(0,20,410,35);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setFont(new Font("Arial",Font.BOLD,28));
        card.add(titulo);

        jugadorX = new JLabel("Jugador X: 0");
        jugadorX.setBounds(35,70,150,30);
        jugadorX.setFont(new Font("Arial",Font.BOLD,16));
        card.add(jugadorX);

        jugadorO = new JLabel("Jugador O: 0");
        jugadorO.setBounds(230,70,150,30);
        jugadorO.setFont(new Font("Arial",Font.BOLD,16));
        card.add(jugadorO);

        turnoLabel = new JLabel("Turno: X");
        turnoLabel.setBounds(0,105,410,30);
        turnoLabel.setHorizontalAlignment(JLabel.CENTER);
        turnoLabel.setFont(new Font("Arial",Font.PLAIN,16));
        card.add(turnoLabel);

        tableroPanel = new JPanel();
        tableroPanel.setLayout(new GridLayout(3,3,8,8));
        tableroPanel.setBounds(40,150,330,330);
        tableroPanel.setBackground(Color.white);
        card.add(tableroPanel);

        crearBotones();

        reiniciar = new JButton("Reiniciar");
        reiniciar.setBounds(110,495,190,32);
        reiniciar.setBackground(new Color(66,133,244));
        reiniciar.setForeground(Color.white);
        reiniciar.setFont(new Font("Arial",Font.BOLD,14));
        reiniciar.setBorder(BorderFactory.createLineBorder(new Color(66,133,244),1));
        card.add(reiniciar);

        reiniciar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                limpiarTablero();
            }
        });
    }

    public void crearBotones()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                tablero[i][j] = "";

                BotonGato boton = new BotonGato(i,j);

                boton.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        jugar(boton);
                    }
                });

                botones[i][j] = boton;
                tableroPanel.add(boton);
            }
        }
    }

    public void jugar(BotonGato boton)
    {
        if(!boton.estado.equals(""))
        {
            return;
        }

        boton.setText(turno);
        boton.estado = turno;
        boton.setEnabled(false);

        tablero[boton.fila][boton.columna] = turno;

        if(verificarGanador())
        {
            if(turno.equals("X"))
            {
                puntosX++;
                jugadorX.setText("Jugador X: " + puntosX);
            }
            else
            {
                puntosO++;
                jugadorO.setText("Jugador O: " + puntosO);
            }

            JOptionPane.showMessageDialog(null, "Ganó jugador " + turno);
            limpiarTablero();
            return;
        }

        if(tableroLleno())
        {
            JOptionPane.showMessageDialog(null, "Empate");
            limpiarTablero();
            return;
        }

        if(turno.equals("X"))
        {
            turno = "O";
        }
        else
        {
            turno = "X";
        }

        turnoLabel.setText("Turno: " + turno);
    }

    public boolean verificarGanador()
    {
        for(int i=0;i<3;i++)
        {
            if(tablero[i][0].equals(turno) &&
               tablero[i][1].equals(turno) &&
               tablero[i][2].equals(turno))
            {
                return true;
            }
        }

        for(int j=0;j<3;j++)
        {
            if(tablero[0][j].equals(turno) &&
               tablero[1][j].equals(turno) &&
               tablero[2][j].equals(turno))
            {
                return true;
            }
        }

        if(tablero[0][0].equals(turno) &&
           tablero[1][1].equals(turno) &&
           tablero[2][2].equals(turno))
        {
            return true;
        }

        if(tablero[0][2].equals(turno) &&
           tablero[1][1].equals(turno) &&
           tablero[2][0].equals(turno))
        {
            return true;
        }

        return false;
    }

    public boolean tableroLleno()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(tablero[i][j].equals(""))
                {
                    return false;
                }
            }
        }

        return true;
    }

    public void limpiarTablero()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                tablero[i][j] = "";
                botones[i][j].estado = "";
                botones[i][j].setText("");
                botones[i][j].setEnabled(true);
            }
        }

        turno = "X";
        turnoLabel.setText("Turno: X");
    }

    public static void main(String[] args)
    {
        new VentanaGatoRaton();
    }
}