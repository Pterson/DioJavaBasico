package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.equipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) throws Exception {
     
        equipamentoMultifuncional eMulti = new equipamentoMultifuncional();

        Impressora impressora = eMulti;
        Digitalizadora digitalizadora = eMulti;
        Copiadora copiadora = eMulti;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
