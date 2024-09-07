package Map;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> estante;
    List<Livro> estante1;

    public LivrariaOnline(){
        estante = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        estante.put(titulo, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        estante.remove(titulo);
    }

    public void exibirLivrosOrdenadosPorPreco(){
        OrdenarPreco ordenar = new OrdenarPreco();
        Collections.sort(estante1, ordenar);
        

    }

}


class OrdenarPreco implements Comparator<Livro>{

    @Override
    public int compare(Livro o1, Livro o2) {
        if (o1.getPreco() > o2.getPreco()){
            return -1;
        }
        else if (o1.getPreco() < o2.getPreco()){
            return 1;
        }
        else{
            return 0;
        }
    }

    
}
