public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JOÃO", "HIGOR", "GIOVANI"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + " é " + alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }

    }
}
