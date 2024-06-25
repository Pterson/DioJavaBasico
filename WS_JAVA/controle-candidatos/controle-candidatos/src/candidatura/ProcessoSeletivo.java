package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //analisarCandidato(1900.0);    
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecaoCandidatos();
        imprimirSelecionados();
    }

    //Método imprimir candidatos selecionados
    static void imprimirSelecionados() {

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);    
        }
        System.out.println("");   
        System.out.println("---INTERAÇÕES COM OS CANDIDATOS---");
        
        for (String candidato : candidatos) {
            System.out.println("O candidato " + candidato);            
            entrandoEmContato(candidato);
        }
        
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando =! atendeu;

            if(continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		}else{
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }

    }

    //Método auxiliar atender
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    //Método seleção de candidatos
    static void selecaoCandidatos() {

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        
        // o laço é feito até 5 candidatos e se houver pessoas na lista
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            //System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + String.format("%.2f", salarioPretendido));
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados = candidatosSelecionados + 1;
            }
            candidatosAtual = candidatosAtual + 1;

        }
    }

    //Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        }
        else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        }
        else {
            System.out.println("Aguardar resultados dos demais candidatos.");
        }
    }    
}
