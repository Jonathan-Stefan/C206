package br.inatel.cdg.carros;

public class SUV extends Carro {

    private String tracao;

    @Override
    public void taxa() {
        System.out.println("Esse carro tem uma taxa de 3% ao ano.");
    }

    @Override
    public void mostraInfo() {

        System.out.println("Ano de fabrição: "+getAno());
        System.out.println("Cor predominante: "+getCor());
        System.out.println("Valor na tabela FIPE: "+getValor());
        System.out.println("A tração é: "+tracao);

    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
}
