import java.util.ArrayList;

/**
 * Created by Damian on 06.11.2017.
 */
public class Main {

    public static void main(String[] args){

        ArrayList<ActionUser> elements = new ArrayList<>();
        elements.add(new Moderator("Jan", "jan231"));
        elements.add(new Moderator("Paweł", "paweł234"));
        elements.add(new Moderator("Adam", "adam12"));
        elements.add(new Admin("Damian", "damian234@wp.pl"));
        elements.add(new Admin("Kamil", "kamil32@o2.pl"));

        for (ActionUser user : elements){
            System.out.println(user.getUsername());
        }
    }
}
