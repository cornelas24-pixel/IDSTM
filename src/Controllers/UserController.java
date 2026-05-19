package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import models.User;

public class UserController {

    private final String URL = "jdbc:mysql://sql.freedb.tech/freedb_DyEidby3";
    private final String USER = "u_PuwJuX";
    private final String PASSWORD = "Qievrsb1FWxR";

    public ArrayList<User> obtenerUsuarios() {

        ArrayList<User> listaUsuarios = new ArrayList<>();

        String query = "SELECT * FROM usuarios";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            );

            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                User usuario = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nombre_completo")
                );

                listaUsuarios.add(usuario);
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return listaUsuarios;
    }

    public boolean registrarUsuario(User u) {

        String query = "INSERT INTO usuarios(username,password,nombre_completo) VALUES(?,?,?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            );

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getNombreCompleto());

            int resultado = ps.executeUpdate();

            ps.close();
            conn.close();

            return resultado > 0;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}