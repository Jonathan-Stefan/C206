package br.inatel.cdg.mercadoria.geladeira;

import br.inatel.cdg.mercadoria.Mercadoria;

public class Geladeira extends Mercadoria {

    private int qtdPortas;
    private int tamanho;
    private String tipo;

    @Override
    public void mostraInfo(){
        System.out.println("Identificação do produto: " + getCodigo());
        System.out.println("Fabricante: "+ getFabricante());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Valor: "+ getValor());
        System.out.println("Quantidade de portas: "+qtdPortas);
        System.out.println("Tamanho em litros: "+tamanho);
        System.out.println("Tipo de acabamento: "+tipo);
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
