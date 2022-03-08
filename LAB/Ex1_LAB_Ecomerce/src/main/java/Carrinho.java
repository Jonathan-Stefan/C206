public class Carrinho {

    double total = 0;
    Produto [] produtos;

    void exibirInfos(Produto produtos []){

        for (int i = 0; i<produtos.length; i++)
        {
            if (produtos[i] != null)
            {
                System.out.println("Nome do produto: " + produtos[i].nome);
                System.out.println("Descrição do produto: " + produtos[i].descricao);
                System.out.println("Fabricante do produto: " + produtos[i].fabricante);
                System.out.println("Preço do produto: " + produtos[i].preco);
                System.out.println();
            }

        }
    }

    double calculaTotal (Produto produtos[])
    {

        for (int i = 0; i <3; i++)
        {
            if (produtos[i] != null)
            {
                total += produtos[i].preco;
            }

        }

        return total;
    }


}
