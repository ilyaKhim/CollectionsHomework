import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pass {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$");

        Matcher matcher = pattern.matcher("Sdasjdaj2&");
        System.out.println(matcher.find());
    }
}

