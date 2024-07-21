public class Autodromo {
    public static void main(String[] args) throws Exception {

        Carro jeep = new Carro();
        jeep.setChassi("123456789");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("987654321");
        z400.ligar();

        
        Veiculo coringa = z400;

        coringa.ligar();
    }
}
