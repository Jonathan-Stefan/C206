package br.inatel.cdg;

import br.inatel.cdg.blocos.Bloco;
import br.inatel.cdg.conversor.Conversor;
import br.inatel.cdg.jogador.Jogador;

public class Main {

    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();
        Bloco bloco5 = new Bloco();
        Bloco bloco6 = new Bloco();
        Bloco bloco7 = new Bloco();

        //Quantidade de blocos antes do jogo
        System.out.println("Quantidade de blocos antes do jogo: "+Bloco.getContBlocos());

        jogador.destroi();
        jogador.destroi();
        jogador.destroi();
        //Quantidade de blocos depois do jogo
        System.out.println("Quantidade de blocos depois do jogo: "+Bloco.getContBlocos());

        System.out.println("Quantidade de pontos do jogador: "+Conversor.conversor(jogador.getPontuacao()));
    }
}
