package edu.peterson.primeirasemana;
public class MinhaCasse {

    public static void main(String[] args) {
        
        String primeroNome = "Peterson";
        String segundoNome = "Ananias";

        String nomeCompleto = nomeCompleto(primeroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);
    }
}