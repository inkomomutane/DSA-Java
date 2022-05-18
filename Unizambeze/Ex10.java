public class Ex10 {
    public static String trocar(String nome) {
        char pr = nome.charAt(0);
        nome =  nome.substring(1 , nome.length()) + (pr + "").toUpperCase();
        return nome;
     }
}
