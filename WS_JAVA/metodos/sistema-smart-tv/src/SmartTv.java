
public class SmartTv {
    boolean ligada =false;
    int canal =1;
    int volume =25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        desligada=false;
    }

    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);        
    }


    public void aumentarCanal(){
        canal++;      
    }
    public void diminuirCanal(){
        canal--;      
    }
    public void alterarCanal(int novoCanal){
        canal = novoCanal;
    }

}
