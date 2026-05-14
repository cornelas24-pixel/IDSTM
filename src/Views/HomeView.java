package Views;

public class HomeView {

    public HomeView() {

    }

    public void showHome() {

        UsersView uv = new UsersView();

        uv.showUsers();
    }
}