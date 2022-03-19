package br.inatel.cdg.inimigo;

public class Asteroide {

    private final String nome;
    private final String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void destruir(){

        System.out.println("Asteroide "+this.nome+" destruido");

    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

}
