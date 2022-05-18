import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    private static final String validadorPassword = "^(?=.*[~!@#$%^&*|]).*$";
    private static final Pattern pattern = Pattern.compile(validadorPassword);
    public static boolean validar(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
