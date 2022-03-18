package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Nave nave = new Nave("Space", 10, "normal");
        Nave nave1 = new Nave("Space1", 10, "explosivo");
        Asteroide asteroidePequeno = new Asteroide("pequeno", "normal");
        Asteroide asteroide1 = new Asteroide("Grande", "explosivo");


    }
}
