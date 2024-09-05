package Set;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> listaAlunos;

    public void adicionarAluno(String nome, int matricula, double media){
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula){
        for (Aluno a : listaAlunos){
            if (a.getMatricula() == matricula){
                listaAlunos.remove(a);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        return alunosPorNome;
    }
    
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(listaAlunos);
        return alunosPorNota;
    }

}
