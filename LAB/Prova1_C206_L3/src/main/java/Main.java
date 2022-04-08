import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        Locadora locadora = new Locadora(); //Cria o objeto e estancia a classe locadora
        locadora.carros = new Carro[2]; // cria o vetor de carros na clase locadora
        String x; //Variavel auxiliar para definir a operação a ser realizada
        Scanner entrada = new Scanner(in);

        locadora.nome = "Localiza";
        locadora.cnpj = "123456789000";
        locadora.endereco = "Av. Perimetral, 210, Pouso Alegre";


        do {
            System.out.println("Digite a operação desejada: ");
            System.out.println();
            System.out.println("1 - Para adicionar carro; ");
            System.out.println("2 - Para verificar carros disponiveis; ");
            System.out.println("3 - Para alugar um carro; ");
            System.out.println("4 - Para saber a porcentagem de carros disponiveis; ");
            System.out.println("Digite sair para encerrar: ");
            System.out.println();
            x = entrada.nextLine();
            switch (x){
                case "1":
                    //Chama a função para adicionar carros
                    locadora.adicionarCarro();
                    break;
                case "2":
                    //Chama a função para mostrar as informaçoes da locadora e dos carro quer possui
                    locadora.mostraInfo();
                    break;
                case "3":
                    //Chama a função para alugar um carro
                    locadora.alugarCarro();
                    break;
                case "4":
                    //Chama a função para saber quantos carros tem para alugar
                    System.out.println("A porcentagem de carros que tem pra alugar é: " + locadora.contarCarrosParaAlugar()+"%");
                    break;
                default:
                    if (x.equals("sair")){
                        System.out.println("Saindo do menu");
                    }else System.out.println("Entrada de dados invalido! Tente novamente.");

                    break;

            }
            System.out.println();
        }while (!(x.equals("sair")));
        entrada.close();

    }
}
