public class Carro extends Veiculo{    

    public void ligar(){
        verificarCambio();
        verificarCombustivel();
        System.out.println("CARRO LIGADO");
    }

    public void verificarCombustivel(){
        System.out.println("VERIFICANDO NIVEL DE COMBUSTIVEL");
    }
    
    public void verificarCambio(){
        System.out.println("VERIFICANDO CAMBIO EM P");
    }
    
    
}
