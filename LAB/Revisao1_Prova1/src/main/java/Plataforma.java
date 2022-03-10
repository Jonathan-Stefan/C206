import java.util.Scanner;

public class Plataforma {

    String nome, criador;
    Jogo[] jogos;
    Scanner novoJogo = new Scanner(System.in);

    int contDlc = 0;


    void adicionarJogo(){
        for (int i = 0; i<jogos.length; i++)
        {
            jogos[i] = new Jogo();

            System.out.println("Digite o nome do jogo: ");
            jogos[i].nome = novoJogo.nextLine();
            System.out.println("Digite o genero do jogo: ");
            jogos[i].genero = novoJogo.nextLine();
            System.out.println("Digite o preco do jogo: ");
            jogos[i].preco = novoJogo.nextDouble();
            novoJogo.nextLine();
            System.out.println("Digite o jogo possui dlc: ");
            jogos[i].dlc = novoJogo.nextBoolean();
            novoJogo.nextLine();
        }
        novoJogo.close();
    }

    void mostraInfo (){
        System.out.println("Nome: " + nome);
        System.out.println("Criador: " + criador);
        for (Jogo jogos : jogos)
            if (jogos != null) {
                System.out.println("Nome do jogo: " + jogos.nome);
                System.out.println("Genero do jogo: " + jogos.genero);
                System.out.println("Preço do jogo: " + jogos.preco);
                System.out.println("Tem dlc: " + jogos.dlc);
            }
        System.out.println();

    }

    void mostraMaisCaroBarato(){
        String maisCaro = ""; //Variavel auxiliar para guardar o nome do jogo mais caro
        String maisBarato = ""; //Variavel auxiliar para guardar o nome do jogo mais barato
        double caro = jogos[0].preco; // Variavel auxiliar para armazenar o preço do 1° jogo e comparar com os demais e ir atualizando com o maior preço
        double barato = jogos[0].preco; // Variavel auxiliar para armazenar o preço do 1° jogo e comparar com os demais e ir atualizando com o menor preço
        for (Jogo jogo : jogos) {
            if (jogo.preco >= caro) {
                caro = jogo.preco;
                maisCaro = jogo.nome;
            }
            if (jogo.preco <= barato) {
                barato = jogo.preco;
                maisBarato = jogo.nome;
            }

        }

        System.out.println("O jogo mais barato é  o: " + maisBarato);
        System.out.println("O jogo mais caro é o: " + maisCaro);
        System.out.println();

    }


    void calculaDlc ()
    {
        for (Jogo jogos : jogos){
            if (jogos != null && jogos.dlc){
                contDlc++;
            }
        }
        System.out.println("A quantidade de jogos que possuem dlc sao: " + contDlc);
    }


}
