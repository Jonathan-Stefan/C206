package br.inatel.cdg;

import br.inatel.cdg.carrinho.Carrinho;
import br.inatel.cdg.produto.Produto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Produto p1 = new Produto("Desodorante", 12.99);
        Produto p2 = new Produto("Shampo", 16.50);
        Produto p3 = new Produto("Sabonete", 1.59);
        Produto p4 = new Produto("Pasta de Dente", 5.68);

        Carrinho carrinho = new Carrinho();


        String x;
        Produto y;

        do {
            System.out.println("Digite a operação desejada:" );
            System.out.println("1 = para adicionar produto no carrinho " );
            System.out.println("sair - para encerrar. ");

            x = input.nextLine();


            switch (x){
                case "1":
                    System.out.println("Digite o produto selecionado");
                    y = p1;
                    carrinho.addProduto(y);
                break;

                default:
                    if (x.equals("sair"))
                        System.out.println("Obrigado por usar nossos serviços. Volte sempre!");
                    else
                        System.out.println("Tente novamente");


            }
        }while (!(x.equals("sair")));


    }
}
