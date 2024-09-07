package Map;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    Map<String, String> palavras;


    public Dicionario(){
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(palavras.toString());
    }

    public static void main(String[] args) {
        Dicionario d = new Dicionario();

        d.adicionarPalavra("Lápis", "Objeto escolar.");

        d.exibirPalavras();
    }

}



