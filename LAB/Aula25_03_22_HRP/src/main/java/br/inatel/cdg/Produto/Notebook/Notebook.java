package br.inatel.cdg.Produto.Notebook;

import br.inatel.cdg.Produto.Produto;

public class Notebook extends Produto {

    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador){
        super(nome, preco);
        this.processador = processador;
        this.gpu = gpu;
        this.armazenamento = armazenamento;
    }

    public void ligar (){
        System.out.println("Notebook Ligando");
    }

    @Override
    public String etiquetaPreco(){
        String res = super.etiquetaPreco() + ", Memoria de: " +armazenamento+", Com GPU de: "+gpu+", Processador: "+processador;

        return res;
    }
}
