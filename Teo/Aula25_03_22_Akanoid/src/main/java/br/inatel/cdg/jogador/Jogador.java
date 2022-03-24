package br.inatel.cdg.jogador;

import br.inatel.cdg.blocos.Bloco;

public class Jogador {

    private int pontuacao = 0;

    public void destroi(){
        int nBlocos = Bloco.getContBlocos();
        Bloco.setContBlocos(--nBlocos);
        pontuacao++;
    }

    public int getPontuacao() {

        return pontuacao;
    }
}
