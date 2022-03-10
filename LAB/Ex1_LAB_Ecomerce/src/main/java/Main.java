//Biblioteca usada para fazer entrada de dados pelo usuario
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner novoProduto = new Scanner(System.in); // Para fazer entrada de dados pelo usuario
        Produto[] produtos = new Produto[4];
        Carrinho carrinho = new Carrinho();
        int i = 0; // variavel usada para alocar elementos em cada vetor

        produtos[i] = new Produto();

        System.out.println("Digite o nome do produto");
        produtos[i].nome = novoProduto.nextLine();

        while (!Objects.equals(produtos[i].nome, "sair"))// Entrada de dados pelo usuario, porém não esta perfeita!!
        {
            System.out.println("Digite a descrição do produto");
            produtos[i].descricao = novoProduto.nextLine();

            System.out.println("Digite o fabricante do produto");
            produtos[i].fabricante = novoProduto.nextLine();

            System.out.println("Digite o preço do produto");
            produtos[i].preco = novoProduto.nextDouble();
            novoProduto.nextLine();
            i++;
            produtos[i] = new Produto();
            System.out.println("Digite o nome do produto");
            produtos[i].nome = novoProduto.nextLine();

        }

        /*//Entrada de dado feita pelo DEV.
        produtos[0] = new Produto();
        produtos[0].nome = "Maca";
        produtos[0].descricao = "Gala";
        produtos[0].fabricante = "Fazenda Santa Luzia";
        produtos[0].preco = 13.45;

        produtos[1] = new Produto();
        produtos[1].nome = "Celular";
        produtos[1].descricao = "MotoG30";
        produtos[1].fabricante = "Motorola";
        produtos[1].preco = 1300;

        produtos[2] = new Produto();
        produtos[2].nome = "Celular";
        produtos[2].descricao = "A20";
        produtos[2].fabricante = "Samsung";
        produtos[2].preco = 1000;

         */

        //Agragação
        carrinho.produtos = produtos;

        //Chama a função exibirInfos da classe Carrinho
        carrinho.exibirInfos();

        //Chama a função que calcula o total da compra e mostra o valor.
        System.out.println("O Preço total da compra será de: R$" + carrinho.calculaTotal());

        //Apaga as entradas de dados da memória
        novoProduto.close();

    }
}
