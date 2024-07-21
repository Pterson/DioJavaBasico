import java.util.Scanner;
import java.util.Locale;


public class Bancao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Configura o Scanner para usar o ponto decimal
        double saldo = 0;

        while (true) {


            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf(Locale.US, "Saldo atual: %.1f\n", saldo);
                    break;
                    
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.printf(Locale.US, "Saldo atual: %.1f\n", saldo);
                    }
                    break;
                    
                case 3:
                    System.out.printf(Locale.US, "Saldo atual: %.1f\n", saldo);
                    break;
                    
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close(); // Fechar o scanner antes de sair do loop
                    return; // Sair do método main para encerrar o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}