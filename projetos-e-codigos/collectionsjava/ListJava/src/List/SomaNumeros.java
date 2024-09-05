
package List;
import java.util.List;

public class SomaNumeros {
    List<Integer> listanumero;

    public void adicionarNumero(int numero){
        listanumero.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer i : listanumero){
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for(Integer i : listanumero){
            if (i > maior){
                maior = i;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = 1;
        for(Integer i : listanumero){
            if (i < menor){
                menor = i;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return listanumero;
    }

}
