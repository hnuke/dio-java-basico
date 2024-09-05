package Set;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {

    public Set<String> conjunto;

    public ConjuntoPalavrasUnicas(){
        conjunto = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra){
        conjunto.add(palavra);
    }

    public void removerPalavra(String palavra){
        conjunto.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return conjunto.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjunto);
        System.out.println(conjunto.size());
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
    
        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");
        conjuntoLinguagens.adicionarPalavra("Java");

    
        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");
    
        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));
    
        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        System.out.println();
      }
    }

