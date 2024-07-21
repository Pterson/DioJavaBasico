import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

        try {
          //  System.out.println("Digite o número da conta bancária:");
            String numeroConta = scanner.nextLine().trim();

            // Chamar o método que verifica se o número da conta é válido
            verificarNumeroConta(numeroConta);
            
            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // Lançar uma IllegalArgumentException com a mensagem adequada
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
