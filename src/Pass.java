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
        String pass = "%$%$%$a";
       /* Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(pass);*/
        System.out.println(pass.matches("\\W+"));

    }
}

