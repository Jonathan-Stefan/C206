import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Arquivo a = new Arquivo();
        Funcionario f = new Funcionario();
        f.nome = "Joao";
        f.idade = 35;
        f.cpf = "222.111.111-52";
        a.escrever(f);



        ArrayList<Funcionario> funcs = a.ler();

        for(int i=0; i< funcs.size(); i++)
        {
            System.out.println("Nome: "+funcs.get(i).nome);
            System.out.println("Idade: "+funcs.get(i).idade);
            System.out.println("CPF: "+funcs.get(i).cpf);
        }


    }
}
