package br.inatel.cdg.inimigo;

public class Asteroide {

    private String nome;
    private String tipoTiro;

    public Asteroide(String nome, String tipoTiro) {
        this.nome = nome;
        this.tipoTiro = tipoTiro;
    }

    public void destruir(){

        System.out.println("Asteroide destruido");

    }
}
