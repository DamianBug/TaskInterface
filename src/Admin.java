/**
 * Created by Damian on 06.11.2017.
 */
public class Admin implements ActionUser {

    private String username;
    private String email;

    public Admin(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
