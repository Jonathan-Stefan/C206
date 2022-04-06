package br.inatel.cdg.mercadoria;

import br.inatel.cdg.mercadoria.fogão.Fogao;
import br.inatel.cdg.mercadoria.geladeira.Geladeira;

public class Main {

    public static void main(String[] args) {

        Mercadoria m1 = new Fogao();
        Mercadoria m2 = new Geladeira();

        Mercadoria [] mercadorias = new Mercadoria[2];

        m1.setCodigo(1);
        m1.setDescricao("Vidro temperado");
        m1.setFabricante("Atlas");
        m1.setValor(836.36);


        m2.setCodigo(2);
        m2.setDescricao("Frost free");
        m2.setFabricante("Brastemp");
        m2.setValor(1352.36);

        mercadorias[0] = m1;
        mercadorias[1] = m2;

        for (Mercadoria mercadoria : mercadorias){
            if (mercadoria instanceof Fogao){

                Fogao f = (Fogao) mercadoria;
                f.setQtdBocas(6);
                f.setTipoAcendimento("Automatico");
                f.mostraInfo();
                System.out.println();

            }else {
                Geladeira g = (Geladeira) mercadoria;
                g.setQtdPortas(2);
                g.setTamanho(845);
                g.setTipo("Inox");
                g.mostraInfo();
                System.out.println();

            }
        }

    }


}
