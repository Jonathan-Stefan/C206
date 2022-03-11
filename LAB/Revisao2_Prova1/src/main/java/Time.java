import java.util.Scanner;

public class Time {

    String nome, corCamisa;
    Jogador[] jogador;
    Scanner input = new Scanner(System.in);
    Estadio estadio;

    void mostraInfo(){
        System.out.println("Time: "+nome);
        System.out.println("Cor da camisa: "+ corCamisa);
        System.out.println();
        System.out.println("Estadio: "+ estadio.nome);
        System.out.println("Capacidade: " + estadio.capacidade);
        System.out.println("Cidade: " + estadio.cidade);
        System.out.println();

        System.out.println("informações sobre os todos os jogadores do time: ");

        for (Jogador value : jogador) {
            if (value != null) {
                System.out.println("Nome: " + value.nome);
                System.out.println("Salario: " + value.salario);
                System.out.println("Numero da camisa: " + value.nCamisa);
                if (value.base) {
                    System.out.println("Veio da base? Sim");
                } else System.out.println("Veio da base? Não");

            }
        }

    }

    void adicionarJogador() {
        for (int i = 0; i < jogador.length; i++) {

            jogador[i] = new Jogador();

            System.out.println("Digite o nome do jogador:");
            jogador[i].nome = input.nextLine();
            System.out.println("Digite o salario do jogador: ");
            jogador[i].salario = input.nextDouble();
            System.out.println("Digite o numero da camisa do jogador: ");
            jogador[i].nCamisa = input.nextInt();
            System.out.println("Digite 'true' caso o jogador tenha vindo da base, caso ao contrario digite 'false': ");
            jogador[i].base = input.nextBoolean();
            input.nextLine();

        }
        input.close();
    }

    double calculaTotalSalario(){
        double total = 0;
        for (Jogador value : jogador)
        {
            total += value.salario;
        }
        return total;

    }

    void mostraInfoJogadoresBase(){
        for (Jogador value : jogador) {
            if (value.base) {
                System.out.println("Nome: " + value.nome);
                System.out.println("Salario: " + value.salario);
                System.out.println("Numero da camisa: " + value.nCamisa);
            }
        }
    }


}
