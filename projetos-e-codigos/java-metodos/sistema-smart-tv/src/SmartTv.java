public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }    

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void mudarDeCanal(int novoCanal){
        canal = novoCanal;
    }


}
