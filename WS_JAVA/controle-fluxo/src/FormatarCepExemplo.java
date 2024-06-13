public class FormatarCepExemplo {
    
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("23765064.4");
        System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde ao valor válido");
            
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
    
}
