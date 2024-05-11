import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número de sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número de sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome e sobrenome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo));

    }
}
