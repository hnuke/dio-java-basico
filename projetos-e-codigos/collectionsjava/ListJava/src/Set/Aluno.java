package Set;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    String nome;
    int matricula;
    double nota;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    @Override
    public int compareTo(Aluno o) {
        return nome.compareToIgnoreCase(o.getNome());
    }

}

class ComparatorPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }

}
