public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        c1.Ligar();
        Moto m1 = new Moto();
        c1.getChassi();
        m1.setChassi("A-B24");
    }
}
