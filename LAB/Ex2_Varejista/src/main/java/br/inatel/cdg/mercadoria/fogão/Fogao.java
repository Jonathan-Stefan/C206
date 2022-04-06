package br.inatel.cdg.mercadoria.fogão;

import br.inatel.cdg.mercadoria.Mercadoria;

public class Fogao extends Mercadoria {
    private int qtdBocas;
    private String tipoAcendimento;

    @Override
    public void mostraInfo(){
        System.out.println("Identificação do produto: " + getCodigo());
        System.out.println("Fabricante: "+ getFabricante());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Valor: "+ getValor());
        System.out.println("Quantidade de bocas: "+ qtdBocas);
        System.out.println("Tipo de acendimento: "+tipoAcendimento);
    }

    public void setQtdBocas(int qtdBocas) {
        this.qtdBocas = qtdBocas;
    }

    public void setTipoAcendimento(String tipoAcendimento) {
        this.tipoAcendimento = tipoAcendimento;
    }
}
