public class Main {

    public static void main(String[] args) {

        Locadora locadora = new Locadora(); //Cria o objeto e estancia a classe locadora
        locadora.carros = new Carro[2]; // cria o vetor de carros na clase locadora

        locadora.nome = "Localiza";
        locadora.cnpj = "123456789000";
        locadora.endereco = "Av. Perimetral, 210, Pouso Alegra";

        //Chama a função para adicionar carros
        locadora.adicionarCarro();

        //Chama a função para mostrar as informaçoes da locadora e dos carro quer possui
        locadora.mostraInfo();

        //Chama a função para alugar um carro
        locadora.alugarCarro();
        System.out.println();
        locadora.mostraInfo();

        //Chama a função para saber quantos carros tem para alugar
        System.out.println("A porcentagem de carros que tem pra alugar é: " + locadora.contarCarrosParaAlugar()+"%");


    }
}
