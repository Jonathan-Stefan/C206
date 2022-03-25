package br.inatel.cdg.Produto;

import br.inatel.cdg.Produto.Camiseta.Camiseta;
import br.inatel.cdg.Produto.Notebook.Notebook;

public class Main {

    public static void main(String[] args) {

        Camiseta c1 = new Camiseta("Anti-Queda", 78.0, "Amarela", "GG");
        Camiseta c2 = new Camiseta("H1", 65, "Preta", "G");

        Notebook not1 = new Notebook("Lenovo", 3555, 1000, "Intel", "I7");
        Notebook not2 = new Notebook("Acer", 4000, 500, "Ryzen", "6");

        Produto[] produtos = new Produto[4];

        produtos[0] = c1;
        produtos[1] = c2;
        produtos[2] = not1;
        produtos[3] = not2;

        for (Produto produto : produtos){
            if (produto !=null){
                System.out.println(produto.etiquetaPreco());
                if (produto instanceof Notebook){
                    Notebook n = (Notebook) produto;
                    n.ligar();
                }
            }
        }

    }
}
