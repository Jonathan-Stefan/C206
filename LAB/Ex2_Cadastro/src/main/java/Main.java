import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner novaEmpresa = new Scanner(System.in); //Função para fazer entradas de dados
        Scanner novoContato = new Scanner(System.in); //Função para fazer entradas de dados

        Contato[] contatos = new Contato[2];
        Empresa empresa = new Empresa();

        //Agregação
        empresa.contatos = contatos;

        System.out.println("Entre com o CNPJ da Empresa: ");
        empresa.cnpj = novaEmpresa.nextLine();
        System.out.println("Entre com o endereço: ");
        empresa.endereco = novaEmpresa.nextLine();
        System.out.println("Entre com os contatos: ");
        for (int i=0; i<2; i++)
        {
            contatos[i] = new Contato();
            System.out.println("Nome: ");
            contatos[i].nome = novoContato.nextLine();
            System.out.println("email: ");
            contatos[i].email = novoContato.nextLine();
            System.out.println("Telefone: ");
            contatos[i].telefone = novoContato.nextLine();
            System.out.println("Data de Nascimento: ");
            contatos[i].dataNascimento = novoContato.nextLine();
        }

        empresa.exibirInfos();

        novaEmpresa.close();
        novoContato.close();
    }
}
