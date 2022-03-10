public class Carrinho {

    double total = 0;
    Produto [] produtos;

    void exibirInfos(){

        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println("Nome do produto: " + produto.nome);
                System.out.println("Descrição do produto: " + produto.descricao);
                System.out.println("Fabricante do produto: " + produto.fabricante);
                System.out.println("Preço do produto: " + produto.preco);
                System.out.println();
            }

        }
    }

    double calculaTotal ()
    {

        for (Produto produto : produtos)
            if (produto != null) {
                total += produto.preco;
            }

        return total;
    }


}
