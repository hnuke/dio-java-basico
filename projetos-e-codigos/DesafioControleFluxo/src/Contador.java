import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        contar(n1,n2);
        


    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException{
        if (p1 > p2){
            throw new ParametrosInvalidosException();
        }
        else{
            for (int i = 1 + p1; i <= p2; i++){
                System.out.println("Imprimindo o número " + (i - p1));
            }
        }
    }

}
