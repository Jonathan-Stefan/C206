import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Variavel para fazer entrada de dados
        Plataforma plataforma = new Plataforma(); // Criando o objeto plataforma
        plataforma.jogos = new Jogo[2]; // Criando o objeto jogo com vetor de 2 possições

        System.out.println("digite o nome da plataforma: ");
        plataforma.nome = input.nextLine();
        System.out.println("Digite o nome do criador dos jogos: ");
        plataforma.criador = input.nextLine();

        //Chamando a função para adicionar jogos à plataforma
        plataforma.adicionarJogo();

        //chamando a função que mostra informações da plataforma e dos jogos criados
        plataforma.mostraInfo();

        //Chamando a função que mostra o valor do jogo mais caro e do mais barato
        plataforma.mostraMaisCaroBarato();

        //chamando a função que calcula quantos jogos possuem dlc
        plataforma.calculaDlc();

        //fecha a entrada de dados e limpa a memoria
        input.close();
    }
}
