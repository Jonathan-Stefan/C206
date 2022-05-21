import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Arquivo a = new Arquivo();
        Funcionario f = new Funcionario();
        boolean flag = true;

        while (flag)
        {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Listar Funcionario");
            System.out.println("3 - Sair");

            int op = input.nextInt();

            switch (op)
            {
                case 1:
                    input.nextLine();
                    System.out.println("Digite o nome do funcionario: ");
                    f.nome = input.nextLine();
                    System.out.println("Digite a idade do funcionario: ");
                    f.idade = input.nextInt();
                    input.nextLine();
                    System.out.println("Digite o CPF do funcionario: ");
                    f.cpf = input.nextLine();
                    a.escrever(f);
                    System.out.println("Funcionario cadastrado com sucesso!");
                    break;
                case 2:
                    ArrayList<Funcionario> funcs = a.ler();
                    for (Funcionario func : funcs) {
                        System.out.println("***funcionário***");
                        System.out.println("Nome: " + func.nome);
                        System.out.println("Idade: " + func.idade);
                        System.out.println("CPF: " + func.cpf);
                    }
                    break;
                case 3:
                    System.out.println("Voce saiu!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;

            }

        }




    }
}
