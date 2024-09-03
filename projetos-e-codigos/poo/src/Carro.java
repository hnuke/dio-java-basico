public class Carro  extends Veiculo{


    public void Ligar(){
        ConferirCombustivel();
        ConferirCambio();
        System.out.println("CARRO LIGADO!");
    }
    private void ConferirCombustivel(){
        System.out.println("Conferindo combustível");
    }
    private void ConferirCambio(){
        System.out.println("Conferindo câmbio");
    }
}
