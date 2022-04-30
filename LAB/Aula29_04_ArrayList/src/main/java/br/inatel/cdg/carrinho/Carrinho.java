package br.inatel.cdg.carrinho;

import br.inatel.cdg.produto.Produto;
import java.util.List;
import java.util.ArrayList;

public class Carrinho {

    private List<Produto> produtolist = new ArrayList<>();

    public void addProduto (Produto produto){
        produtolist.add(produto);
    }
}
