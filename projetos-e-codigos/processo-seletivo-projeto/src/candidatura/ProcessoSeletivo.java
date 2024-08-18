package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");


        System.out.println(AnalisarCandidato(520));
        System.out.println(AnalisarCandidato(250));
        System.out.println(AnalisarCandidato(10000));

        imprimirSelecionados();

        String[] candidatos = {"FELIPE", "JOÃO", "GIOVANI", "HUGO","KIRA"};
        for(String candidato : candidatos){

        }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS REALIZADAS " + tentativasRealizadas);

    }


    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "JOÃO", "GIOVANI", "HUGO","KIRA"};
        for(int indice = 0; indice <= candidatos.length; indice++){
            System.out.println("Candidato " + candidatos[indice] + " cujo indice é " + (indice + 1));
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE, JOÃO, GUILHERME, GIOVANI, HUGO, TOLEDO, TIEMI, ROSE, DIRCEU, AMORA, MEG, KIRA, THEODORO, TUTTI"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido );
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    
    
    }

    static String AnalisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            return "LIGAR PARA CANDIDATO";
        else if (salarioPretendido == salarioBase)
            return "LIGAR PARA CANDIDATO COM CONTRA RESPOSTA";
        else
            return "AGUARDANDO RESULTADO DEMAIS CANDIDATOS";   

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

}
