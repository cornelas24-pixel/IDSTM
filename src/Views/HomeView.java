package Views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class HomeView {

    public HomeView() {

    }

    public void showHome() {

        JFrame ventana = new JFrame();

        ventana.setSize(1000, 640);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setMinimumSize(new Dimension(200,200));
        ventana.setMaximumSize(new Dimension(1200,800));
        ventana.setTitle("Home");
        ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
        ventana.setLayout(null);

        ventana.setVisible(true);
    }
}