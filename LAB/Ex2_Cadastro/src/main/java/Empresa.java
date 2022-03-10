public class Empresa {

    String cnpj, endereco;
    Contato[] contatos;

    void exibirInfos ()
    {
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("contatos: ");

        for (Contato contato: contatos){
            if (contato != null){
                System.out.println(contato.nome);
                System.out.println(contato.email);
                System.out.println(contato.telefone);
                System.out.println(contato.dataNascimento);
            }
        }

    }
}
