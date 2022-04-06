import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        Locadora locadora = new Locadora(); //Cria o objeto e estancia a classe locadora
        locadora.carros = new Carro[2]; // cria o vetor de carros na clase locadora
        int x; //Variavel auxiliar para definir a operação a ser realizada
        Scanner input = new Scanner(in);

        locadora.nome = "Localiza";
        locadora.cnpj = "123456789000";
        locadora.endereco = "Av. Perimetral, 210, Pouso Alegre";




        do {
            System.out.println("Digite a operação desejada: ");
            System.out.println();
            System.out.println("Para adicionar carro digite 3: ");
            System.out.println("Para verificar carros disponiveis digite 4: ");
            System.out.println("Para alugar um carro digite 5: ");
            System.out.println("Para saber a porcentagem de carros disponiveis digite 6: ");
            System.out.println("Digite 5 para sair do menu 7: ");
            System.out.println();
            x = input.nextInt();
            switch (x){
                case 3:
                    //Chama a função para adicionar carros
                    locadora.adicionarCarro();
                    break;
                case 4:
                    //Chama a função para mostrar as informaçoes da locadora e dos carro quer possui
                    locadora.mostraInfo();
                    break;
                case 5:
                    //Chama a função para alugar um carro
                    locadora.alugarCarro();
                    break;
                case 6:
                    //Chama a função para saber quantos carros tem para alugar
                    System.out.println("A porcentagem de carros que tem pra alugar é: " + locadora.contarCarrosParaAlugar()+"%");
                    break;
                default:
                    System.out.println("Entrada de dados invalido! Tente novamente.");
                    break;

            }
            System.out.println();
        }while (x!=7);

    }
}
