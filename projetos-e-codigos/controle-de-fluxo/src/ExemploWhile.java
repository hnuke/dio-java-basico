import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.00;
        while (mesada > 0) {
            Double valorDoce = ValorAleatorio();
            
            System.out.println("Valor do doce: " + valorDoce);
            mesada -= valorDoce;
            System.out.println("Mesada: " + mesada);
        }
    }

    static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
