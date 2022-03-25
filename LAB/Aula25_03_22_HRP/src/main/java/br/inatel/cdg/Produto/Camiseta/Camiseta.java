package br.inatel.cdg.Produto.Camiseta;

import br.inatel.cdg.Produto.Produto;

public class Camiseta extends Produto {

    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho){
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;

    }

    @Override
    public String etiquetaPreco(){
        String res = super.etiquetaPreco() + ", cor: " +cor+", tamanho: "+tamanho;

        return res;
    }
}
