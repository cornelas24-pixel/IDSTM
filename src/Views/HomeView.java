package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controllers.UserController;

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
        ventana.setTitle("Usuarios");
        ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
        ventana.setLayout(null);

        JPanel panel = new JPanel();

        panel.setLayout(null);
        panel.setBounds(0,0,1000,640);
        panel.setBackground(Color.WHITE);

        ventana.add(panel);

        JLabel titulo = new JLabel("Lista de usuarios");

        titulo.setBounds(40,40,300,30);

        panel.add(titulo);

        UserController uc = new UserController();

        ArrayList<Object[]> users = uc.getUsers();

        String[] columnas = {
            "ID",
            "Username",
            "Password",
            "Nombre completo"
        };

        Object[][] data = new Object[users.size()][4];

        for(int i = 0; i < users.size(); i++) {

            data[i] = users.get(i);
        }

        JTable tabla = new JTable(data, columnas);

        JScrollPane scroll = new JScrollPane(tabla);

        scroll.setBounds(40,100,850,300);

        panel.add(scroll);

        ventana.setVisible(true);
    }
}