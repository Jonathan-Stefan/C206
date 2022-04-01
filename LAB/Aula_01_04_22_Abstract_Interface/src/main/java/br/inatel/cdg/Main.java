package br.inatel.cdg;

import br.inatel.cdg.carros.Carro;
import br.inatel.cdg.carros.Hatch;
import br.inatel.cdg.carros.SUV;
import br.inatel.cdg.carros.Sedan;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Sedan();
        Carro c2 = new Hatch();
        Carro c3 = new SUV();

        Carro [] carros = new Carro[3];

        c1.setAno(2022);
        c1.setCor("Prata");
        c1.setValor(54000);

        c2.setAno(2020);
        c2.setCor("Vermelho");
        c2.setValor(32000);

        c3.setAno(2019);
        c3.setCor("Preta");
        c3.setValor(85000);

        carros[0] = c1;
        carros[1] = c2;
        carros[2] = c3;

        for (Carro carro : carros){
            if (carro instanceof SUV){
                SUV s = (SUV) carro;
                s.setTracao("4x4");
                s.mostraInfo();
            }else if (carro instanceof Sedan){
                Sedan s = (Sedan) carro;
                s.setPortaMalas(450);
                s.mostraInfo();
            }else {
                Hatch h = (Hatch) carro;
                h.setPortas(2);
                h.mostraInfo();
            }
        }


    }
}
