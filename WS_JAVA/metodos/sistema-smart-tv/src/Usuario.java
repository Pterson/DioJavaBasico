public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();        
        smartTv.diminuirVolume();        
        smartTv.aumentarVolume();       
        
        System.out.println("Canal atual: " +smartTv.canal);
        smartTv.alterarCanal(27);
        
        System.out.println("Volume atual -> " +smartTv.volume);
        

        
        System.out.println("TV ligada    -> " +smartTv.ligada);
        System.out.println("Canal atual  -> " +smartTv.canal);
        System.out.println("Volume atual -> " +smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV está ligada -> " +smartTv.ligada);


    }
}
