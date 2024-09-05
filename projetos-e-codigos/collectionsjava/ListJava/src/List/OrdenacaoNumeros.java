package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> listnumero;

    public void adicionarNumero(int numero){
        listnumero.add(numero);
    }

    public List<Integer> ordernarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(this.listnumero);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaAscendente = new ArrayList<>(this.listnumero);
        listaAscendente.sort(Collections.reverseOrder());
        return listaAscendente;
        
    }
}
