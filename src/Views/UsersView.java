package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controllers.UserController;
import models.User;

public class UsersView {

    private JFrame ventana;
    private JTable tabla;
    private DefaultTableModel modelo;

    public void showUsers() {

        ventana = new JFrame();

        ventana.setSize(1000,640);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setMinimumSize(new Dimension(200,200));
        ventana.setMaximumSize(new Dimension(1200,800));
        ventana.setTitle("Usuarios");
        ventana.getContentPane().setBackground(Color.WHITE);
        ventana.setLayout(null);

        JPanel panel = new JPanel();

        panel.setLayout(null);
        panel.setBounds(0,0,1000,640);
        panel.setBackground(Color.WHITE);

        ventana.add(panel);

        modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Username");
        modelo.addColumn("Password");
        modelo.addColumn("Nombre completo");

        tabla = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tabla);

        scroll.setBounds(40,80,850,300);

        panel.add(scroll);

        JButton nuevo = new JButton("Nuevo Registro");

        nuevo.setBounds(40,30,180,35);

        panel.add(nuevo);

        cargarTabla();

        nuevo.addActionListener(e -> {

            RegisterView rv = new RegisterView(this);

            rv.showRegister();
        });

        ventana.setVisible(true);
    }

    public void cargarTabla() {

        modelo.setRowCount(0);

        UserController uc = new UserController();

        ArrayList<User> usuarios = uc.obtenerUsuarios();

        for(User u : usuarios) {

            Object[] fila = {
                u.getId(),
                u.getUsername(),
                u.getPassword(),
                u.getNombreCompleto()
            };

            modelo.addRow(fila);
        }
    }
}