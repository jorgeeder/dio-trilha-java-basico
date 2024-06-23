import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoBancario = 237.48;

        System.out.println("Bem vindo ao Banco Dio");

        System.out.print("Qual o seu nome ? ");
        String cliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência ! ");
        String codigoAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta Bancaria ! ");
        int numeroContaBancaria = scanner.nextInt();

        System.out.println("Olá, " + cliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + codigoAgencia +
                ", conta " + numeroContaBancaria +
                " e seu saldo " + saldoBancario +
                " já está disponível para saque"
        );
    }
}