import java.util.HashSet;
import java.util.Set;

public class Conta {

     private double saldo, limite;
    Set<Cliente> clientes = new HashSet<>();

     public Conta (double saldo, double limite){ //Esse contrutor recebe parametros
         this.saldo = saldo;
         this.limite = limite;
     }
     public void adiconaCliente (Cliente cliente){
         clientes.add(cliente);
     }


    void sacar (double quantia){
        saldo -= quantia;
    }

    void depositar (double quantia){
        saldo += quantia;
    }

    public void mostraInfo() {

             for (Cliente cliente: clientes)
             {
                 try{
                      System.out.println("Nome: "+cliente.getNome()+" CPF: "+cliente.getCpf());
                      System.out.println("Saldo: "+saldo + " Limite: "+limite);
                 }catch (NullPointerException e){
                     System.out.println(e);
                 }
             }
    }

    // Getters e Setter -> Devolve e Seta o valor de saldo
    public double getSaldo(){
        return saldo;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
}
