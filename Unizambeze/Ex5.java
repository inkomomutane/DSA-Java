public class Ex5 {
    private static final char vogais[] = {'a','e','i','o','u'};

    public static int  contarVogais(String texto) {
        int qntVogais = 0 ; 
        for (int i = 0; i < texto.length(); i++) { // contar tamanho de letras que tem o texto
            for (int j = 0; j < vogais.length; j++) { //fazer a comparação de letra do texto e vogais 
                if(texto.charAt(i) == vogais[j]){//comparação
                    qntVogais++;
                    break;
                }
            }
        }
        return qntVogais;
    }
}
