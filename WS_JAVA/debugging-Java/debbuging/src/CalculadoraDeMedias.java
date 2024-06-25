import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Ralf", "Iori", "Ryu", "Goro"};

        double media = CalcularMediaPorTurma(alunos, scan);

        System.out.printf("Média da turma %.1f: ", media);
    }

    public static double CalcularMediaPorTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;

    }
    
}
