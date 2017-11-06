/**
 * Created by Damian on 06.11.2017.
 */
public class Moderator implements ActionUser {

    private String username;
    private String password;

    public Moderator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
