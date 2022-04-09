package br.inatel.cdg.brownie;

public class Brownie {

    protected String nome;
    protected String sabor;
    protected double preco;

    public Brownie (String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Vai adicionar os pedidos ao carrinho.");

    }
    public void calculaValorTotalCompra(){
        System.out.println("Nome: "+nome);
        System.out.println("Preco: "+preco);

    }

    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Sabor: "+sabor);
        System.out.println("Preco: "+preco);
        System.out.println();
    }


}
