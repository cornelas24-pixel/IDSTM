package Main;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class VentanaGatoRaton extends JFrame {

    public VentanaGatoRaton() {
        setTitle("Gato y Ratón");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JPanel panelSuperior = new JPanel();
        JLabel gato = new JLabel("Gato: 0");
        JLabel raton = new JLabel("Ratón: 0");
        panelSuperior.add(gato);
        panelSuperior.add(raton);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 5, 5));

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);


        JButton reiniciar = new JButton("Reiniciar");
        JPanel panelInferior = new JPanel();
        panelInferior.add(reiniciar);

        add(panelSuperior, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new VentanaGatoRaton().setVisible(true);
    }
}