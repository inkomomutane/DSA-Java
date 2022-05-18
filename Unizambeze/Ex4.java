import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    private static final String validadorPassword = "^([a-zA-Z0-9]+)$";
    private static final Pattern pattern = Pattern.compile(validadorPassword);
    public static boolean validar(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
