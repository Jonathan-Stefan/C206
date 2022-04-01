package br.inatel.cdg.carros;

public class Hatch extends Carro{

    private int portas;

    @Override
    public void taxa() {
        System.out.println("Esse carro tem uma taxa de 2.5% ao ano.");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Ano de fabrição: "+getAno());
        System.out.println("Cor predominante: "+getCor());
        System.out.println("Valor na tabela FIPE: "+getValor());
        System.out.println("Numero de portas: "+portas);

    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
