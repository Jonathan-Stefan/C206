package br.inatel.cdg.brownie.brownieNutella;

import br.inatel.cdg.brownie.Brownie;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println(this.nome+" Esta adicionando nutella. ");
    }
}
