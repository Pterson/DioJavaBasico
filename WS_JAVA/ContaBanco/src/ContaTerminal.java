import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {    

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");    
        int numeroConta = scanner.nextInt();
        //scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite saldo inicial da conta:");
        double saldoConta = scanner.nextDouble();
        
        scanner.close();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("");
        System.out.println("============================================================ Extrato Conta ============================================================");
        System.out.println("");
        System.out.println("= Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                   + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque. =");
        System.out.println("");
        System.out.println("=======================================================================================================================================");
    }
}