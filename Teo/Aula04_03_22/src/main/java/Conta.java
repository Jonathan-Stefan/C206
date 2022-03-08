public class Conta {

     private double saldo, limite;

     public Conta (double saldo, double limite){ //Esse contrutor recebe parametros
         this.saldo = saldo;
         this.limite = limite;
     }

     public Conta(){
         //Contrutor que não recebe parametros
     }

    void sacar (double quantia){
        saldo -= quantia;
    }

    void depositar (double quantia){
        saldo += quantia;
    }

    // Getters e Setter -> Devolve e Seta o valor de saldo
    public double getSaldo(){
        return saldo;
    }


}
