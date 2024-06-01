public class Operadores {
    public static void main(String[] args) throws Exception {

                /******************Atribuição******************/
                System.out.println("Atribuição");                
                String nomeCompleto = "Peterson" + "Ananias";
                System.out.println(nomeCompleto);
        
        
        
                String concatenacao ="?"; 
        
                concatenacao = 1+1+1+"1";
                System.out.println(concatenacao);
        
                concatenacao = 1+"1"+1+1;
                System.out.println(concatenacao);
        
                concatenacao = 1+"1"+1+"1";
                System.out.println(concatenacao);
        
                concatenacao = "1"+1+1+1;
                System.out.println(concatenacao);
        
                concatenacao = "1"+(1+1+1);
                System.out.println(concatenacao);
                
        
        
                String nome = "Peterson";
                int idade = 22;
                double peso = 74.1;
                char sexo = 'M'; 
                boolean doadorOrgao = false;
                //Date dataNascimento = new Date();
        
        
                /******************Aritméticos******************/
                System.out.println("Aritméticos");
        
                double soma = 10.5 + 15.7;
                System.out.println(soma);
                
                int subtracao = 113 - 25;
                System.out.println(subtracao);
                
                int multiplicacao = 20 * 7;
                System.out.println(multiplicacao);
                
                int divisao = 15 / 3;
                System.out.println(divisao);
                
                int modulo = 18 % 3;
                System.out.println(modulo);
                
                double resultado = (10 * 7) + (20/4);
                System.out.println(resultado);
        
                /*************************************************/
        
        
                /******************Unários******************/
                System.out.println("Unários");
                
                int numero = 5;
                        
                //Imprimindo o numero negativo
                System.out.println(- numero);
                
                //incrementando numero em mais 1 numero, imprime 6
                numero ++;
                System.out.println(numero);
                
                //incrementando numero em mais 1 numero, imprime 7
                System.out.println(numero ++);// ops algo de errado não está certo
                
                System.out.println(numero);// agora sim, numero virou 7
                
                //ordem de precedencia conta aqui
                System.out.println(++ numero);
                
                boolean verdadeiro = true;
                
                System.out.println("Inverteu " + !verdadeiro);
        
                numero = numero * -1;// tornando o valor positivo
                
                /******************************************/
        
                /******************Ternário******************/
                System.out.println("numeroTernario");
                int numeroTernario = 5;
        
                System.out.println( ++ numeroTernario);// Regra de precedencia
                
                System.out.println(numeroTernario --);// Regra de pos
        
        
                //Invertendo valor booleano em uma variavel
                boolean variavel = true;
                variavel = !variavel;
                System.out.println(variavel);
        
                 //Operando ternario
                 int a, b;
                 
                 a = 5;
                 b = 6;
                 
                 /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
                 if(a==b)
                    resultado = "verdadeiro";
                 else
                    resultado = "falso";
                 */
                 
                 //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
                 String result = (a==b) ? "verdadeiro" : "false";
                 
                 System.out.println(result);
                 
                 //Aplicando o ternario
                int a, b;
                a = 6;
                b = 5;
        
                String resultado = a==b ? "verdadeiro" : "falso";
        
                System.out.println(resultado);
                 
                 /******************************************/
                 
                 
                 /******************OPeradores Relacionacis******************/
            int numero1 = 1;
            int numero2 = 2;
             
            //IGUAIS
            boolean simNao = numero1 == numero2;
            System.out.println("numeroUm e igual a numeroDois? " + simNao);
        
            //DIFERENTES
            simNao = numero1 != numero2;
            System.out.println("numeroUm e diferente de numeroDois? " + simNao);
        
            //N1 MAIOR que N2
            simNao = numero1 > numero2;
            System.out.println("numeroUm e maior de numeroDois? " + simNao);
        
            //N1 menor que N2 - condicional
            System.out.println("O numero 1 é menor que o numero2?");
            if(numero1 < numero2) {
                System.out.println("A condição é Verdadeira!");
            }
        
            //Comparando Strings
            String nomeUm = "Pet";
            String nomeDois = "Pet";
            
            System.out.println("Nome1 é igual o Nome2?");
            System.out.println(nomeUm == nomeDois);
         
            /**********************************************************/

    /******************OPeradores Lógicos********************/
    boolean condicao1=true;
    boolean condicao2=true;

    if(condicao1 && condicao2)  {
        System.out.println("As duas condições são verdadeiras");
    }
    if(condicao1 || condicao2) {
        System.out.println("Pelo menos uma das condições é verdadeira");
    }
    System.out.println(">>>saindo....");
 
    /**********************************************************/
    }
}
