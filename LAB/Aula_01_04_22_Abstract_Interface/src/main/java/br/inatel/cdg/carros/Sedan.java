package br.inatel.cdg.carros;

public class Sedan extends Carro{

    private int portaMalas;

    @Override
    public void taxa() {
        System.out.println("Esse carro tem uma taxa de 3.5% ao ano.");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Ano de fabrição: "+getAno());
        System.out.println("Cor predominante: "+getCor());
        System.out.println("Valor na tabela FIPE: "+getValor());
        System.out.println("Capacidade do porta malas em litros: "+portaMalas);

    }

    public int getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }
}
