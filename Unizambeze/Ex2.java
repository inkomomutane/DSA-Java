import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    private static final String IPV4 = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
    private static final Pattern pattern = Pattern.compile(IPV4);
    public static boolean validar(final String ipv4) {
        Matcher matcher = pattern.matcher(ipv4);
        return matcher.matches();
    }
}