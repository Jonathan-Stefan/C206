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


    void sacar (double quantia) throws SaldoInsuficienteException{
         if (saldo > quantia)
             saldo -= quantia;
         else
             throw new SaldoInsuficienteException("Saldo insuficiente");

    }

    void depositar (double quantia){
        saldo += quantia;
    }

    public void mostraInfo() {

        System.out.println("Saldo: "+saldo + " Limite: "+limite);

        for (Cliente cliente: clientes)
        {
            try{
                System.out.println("Nome: "+cliente.getNome()+" CPF: "+cliente.getCpf());

            }catch (NullPointerException e){
                System.out.println("Não existe cliente nessa posição. ");
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
