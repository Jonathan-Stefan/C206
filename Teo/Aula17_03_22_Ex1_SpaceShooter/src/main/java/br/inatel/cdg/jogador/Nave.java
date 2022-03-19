package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private final String tipoTiro;


    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if (tipoTiro.equals("explosivo")){
            ast.destruir();
        }
        else if (ast.getTipoAsteroide().equals("grande")){
            System.out.println("Nave do tipo normal não destroi asteroide grande");

        }else ast.destruir();

    }

}
