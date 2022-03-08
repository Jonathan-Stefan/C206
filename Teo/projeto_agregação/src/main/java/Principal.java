public class Principal {
    public static void main(String[] args) {

        Conta c = new Conta();
        c.saldo = 250;
        c.limite = 10;

        Cliente cliente = new Cliente();
        cliente.nome = "Jonathan";
        cliente.cpf = "123456789";
        cliente.idade = 29;

        //Agregação
        c.cliente = cliente;

        System.out.println(c.cliente);
        System.out.println(cliente);


    }
}
