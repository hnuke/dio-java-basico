public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // reprodutor musical
    public void tocar(){
        System.out.println("Tocando!");
    }
    public void pausar(){
        System.out.println("Pausando!");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando Música - " + musica);
    }

    // aparelhotelefonico
    public void ligar(String numero){
        System.out.println("Ligando para o número - " + numero);
    }
    public void atender(){
        System.out.println("Atendendo!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz!");
    }
    
    // navegadorinternet
    public void exibirPagina(String url){
        System.out.println("Exibindo página!");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando Nova Aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Página");
    }
}
