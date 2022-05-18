import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {
    private static final String regex = "^{2}[%](){0,5}$";
    private static final Pattern pattern = Pattern.compile(regex);
    public static boolean validar(final String texto) {
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }
}
