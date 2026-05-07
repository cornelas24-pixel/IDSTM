package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AuthModel {

    private final String URL = "jdbc:mysql://127.0.0.1:3306/prueba";
    private final String USER = "root";
    private final String PASSWORD = "";

    public AuthModel() {

    }

    public boolean register(String username, String password, String nombreCompleto) {

        String query = "INSERT INTO usuarios(username,password,nombre_completo) VALUES(?,?,?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, nombreCompleto);

            int resultado = ps.executeUpdate();

            ps.close();
            conn.close();

            return resultado > 0;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }

    public boolean access(String username, String password) {

        String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                rs.close();
                ps.close();
                conn.close();

                return true;
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}