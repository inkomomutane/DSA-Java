public class Ex6 {
    private static final String vogais = "[aeiou]";

    public static String substituicao(String texto,String substituto) {
       return texto.replaceAll(vogais, substituto);
    }
}
