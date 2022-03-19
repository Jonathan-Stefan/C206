package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Nave nave = new Nave("Space", 100.0, "normal");
        Nave nave1 = new Nave("Space1", 100.0, "explosivo");
        Asteroide asteroidePequeno = new Asteroide("Pequeno", "pequeno");
        Asteroide asteroideGrande = new Asteroide("Grande", "grande");

        nave.atirar(asteroidePequeno); //Destroi o asteroide
        nave.atirar(asteroideGrande); // Não é possivel destruir
        nave1.atirar(asteroidePequeno); // Destroi o asteroide
        nave1.atirar(asteroideGrande); // Destroi o asteroide

    }
}
