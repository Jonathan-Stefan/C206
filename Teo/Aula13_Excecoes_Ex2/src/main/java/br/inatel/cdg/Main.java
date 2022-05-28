package br.inatel.cdg;

import br.inatel.cdg.excecoes.checked.NotaInsuficiente;
import br.inatel.cdg.excecoes.unchecked.NomeDuplicado;
import br.inatel.cdg.fetin.Fetin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Fetin projetos = new Fetin();

        String x;

        do {
            System.out.println("digite a opção desejada:");
            System.out.println("1 - Para Adicionar um projeto e sua nota");
            System.out.println("2 - Para mostrar todos os projetos e sau notas");
            System.out.println("sair - para sair do menu");
            x = input.nextLine();
            String aux1;
            double aux2;

            switch (x){

                case "1":
                    try {
                        try {
                            System.out.println("Digite o nome do projeto: ");
                            aux1 = input.nextLine();
                            System.out.println("Digite a nota do projeto: ");
                            aux2 = input.nextDouble();
                            input.nextLine();
                            //projetos.verificaNomeDuplicado(aux1);
                            projetos.inserirProjeto(aux1, aux2);
                        }catch (NomeDuplicado e){
                            e.printStackTrace();
                        }

                    }catch (NotaInsuficiente e){
                        e.printStackTrace();
                    }
                    break;

                case "2":
                    projetos.mostraInfo();
                    System.out.println(projetos.getCont());
                    break;

                default:
                    if (x.equals("sair"))
                        System.out.println("Obrigado por usar nossos serviços. ");
                    else System.out.println("Entrada invalida! Tente novamente. ");
                    break;
            }
        }while (!(x.equals("sair")));

        input.close();
    }
}
