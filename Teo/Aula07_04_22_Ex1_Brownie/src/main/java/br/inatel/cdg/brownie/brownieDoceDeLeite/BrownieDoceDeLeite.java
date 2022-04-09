package br.inatel.cdg.brownie.brownieDoceDeLeite;

import br.inatel.cdg.brownie.Brownie;

public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println(this.nome +" Esta adicionando doce de leite. ");
    }
}
