public class Main {

    public static void main(String[] args) {

        Time time = new Time(); // Criando o objeto e estanciando a classe time
        time.estadio = new Estadio(); // Fazendo agregação do estadio ao time;
        time.jogador = new Jogador[2]; // Criando um vetor para jogadores

        time.estadio.nome = "Maracana";
        time.estadio.cidade = "Rio de Janeiro";
        time.estadio.capacidade = 120000;

        time.nome = "Flamengo";
        time.corCamisa = "preto e vermelho";

        //chama a função para adicionar os jogadores
        time.adicionarJogador();

        //Chama a função para mostrar as informações
        time.mostraInfo();
        System.out.println();

        //Chama a função para calcular o salario total dos jogadores
        System.out.println("O soma dos salarios dos jogadores é: "+time.calculaTotalSalario());
        System.out.println();

        //chama a função para mostrar as informações do jogadores que vieram da base
        System.out.println("Informações sobre os jogadores que vieram da base");
        time.mostraInfoJogadoresBase();

    }
}
