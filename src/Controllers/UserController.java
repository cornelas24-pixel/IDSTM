package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserController {

    private final String URL = "jdbc:mysql://127.0.0.1:3306/tu_basedatos";
    private final String USER = "root";
    private final String PASSWORD = "";

    public ArrayList<Object[]> getUsers() {

        ArrayList<Object[]> usersList = new ArrayList<>();

        String query = "SELECT id, username, password, nombre_completo FROM usuarios";

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

                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nombre_completo")
                };

                usersList.add(row);
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return usersList;
    }
}