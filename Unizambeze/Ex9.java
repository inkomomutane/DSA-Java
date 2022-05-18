public class Ex9 {
    private static final String regex = "[ ]";
    public static String substituicao(String texto) {
       return texto.replaceAll(regex, "?");
    }
}
