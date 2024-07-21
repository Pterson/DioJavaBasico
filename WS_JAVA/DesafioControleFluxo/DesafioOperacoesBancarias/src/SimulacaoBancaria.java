import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Escolha a operação:");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Verificar Saldo");
            System.out.println("0: Encerrar Programa");
            System.out.println("****************************");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("**********Extrato**********");
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    System.out.println("***************************");
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                   
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("**********Extrato**********");
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                        System.out.println("***************************");
                    } else {
                        System.out.println("**********ATENÇÃO**********");
                        System.out.println("Saldo insuficiente.");
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                        System.out.println("***************************");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("**********Extrato**********");
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    System.out.println("***************************");
                    break;
                case 0:
                case 4:
                    System.out.println("Programa encerrado.");
                    System.out.println("***************************");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("***************************");
            }
        }
        scanner.close();
    }
}