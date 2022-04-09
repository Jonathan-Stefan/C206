package br.inatel.cdg.brownie.bownieCafe;

import br.inatel.cdg.brownie.Brownie;

public class BrownieCafe extends Brownie {
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println(this.nome +" esta adicionando café.");
    }

}
