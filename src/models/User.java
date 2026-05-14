package models;

public class User {

    private int id;
    private String username;
    private String password;
    private String nombreCompleto;

    public User() {

    }

    public User(
        int id,
        String username,
        String password,
        String nombreCompleto
    ) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    public User(
        String username,
        String password,
        String nombreCompleto
    ) {

        this.username = username;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}