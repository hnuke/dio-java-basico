import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> listaDeTarefas;


    public ListaTarefas(){
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getDescricao().equals(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotaldeTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaDeTarefas);
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
