import java.io.Console;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o saldo: R$ ");
        double saldo = scanner.nextDouble();
    
        System.out.println();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu " + saldo +" já está disponível para saque");
        
    }
}
