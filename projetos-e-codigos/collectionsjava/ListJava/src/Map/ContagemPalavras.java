package Map;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    Map<String, Integer> palavras;


    public ContagemPalavras(){
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(palavras);
    }

}
