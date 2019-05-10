import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pass {

    static boolean checkPass(String pass){
        if(pass.length()<8 || pass.length() > 20){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^.{8,20}(?=.*[0-9])$");

        Matcher matcher = pattern.matcher("as22dddd");
        System.out.println(matcher.find());
    }
}

