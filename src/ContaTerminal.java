import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o número da conta, por favor: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite seu nome completo: ");
        nomeCliente = scanner.nextLine();


        System.out.print("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar " +
                "uma conta em nosso banco, sua agência é %s, conta %d, " +
                "e seu saldo de %,.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo );

    }
}
