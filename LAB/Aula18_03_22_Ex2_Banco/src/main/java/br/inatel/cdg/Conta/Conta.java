package br.inatel.cdg.Conta;

public class Conta {

    private static int qtdContas = 0;

    private double saldo;

    public Conta(){
        qtdContas++;
    }

    public static int getQtdContas() {
        return qtdContas;
    }

    public void depositar (double valor){
        saldo += valor;
    }
    public  void saca (double valor){
        saldo -= valor;
    }

    public void extrato (){
        System.out.println("O valor da conta é: "+this.saldo);
    }
}
