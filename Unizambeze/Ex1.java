import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1{
    private static final String matricula = "^([A-Z]{3})-([1-9]{3})-(MC|MP|GZ|IB|SF|MN|TT|ZB|NP|NS|CA)$";
    private static final Pattern pattern = Pattern.compile(matricula);
    public static boolean validar(final String ipv4) {
        Matcher matcher = pattern.matcher(ipv4);
        return matcher.matches();
    }
}