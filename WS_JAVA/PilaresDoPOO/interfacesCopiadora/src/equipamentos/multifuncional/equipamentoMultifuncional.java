package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class equipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA MULTIFUNCIONAL...");
        
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL...");
        
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL...");
        
    }
    
}
