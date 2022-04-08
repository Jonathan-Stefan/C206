import java.util.Scanner;

import static java.lang.System.*;

public class Locadora {

    String nome, cnpj, endereco;
    int carrosParaAlugar = 0;
    Carro[] carros;
    Scanner input = new Scanner(in);


    void adicionarCarro(){
        for (int i=0; i<carros.length;i++){
            carros[i] = new Carro();

            out.println("Digite o nome do carro: ");
            carros[i].nome = input.nextLine();
            out.println("Digite a cor do carro: ");
            carros[i].cor = input.nextLine();
            out.println("Digite 'TRUE' caso o carro esteja alugado ou 'FALSE' se ele não estiver: ");
            carros[i].alugado = input.nextBoolean();
            out.println("Digite a velocidade maxima do carro: ");
            carros[i].motor.velocidadeMaxima = input.nextDouble();
            carrosParaAlugar++;
            input.nextLine();
        }
    }

    //Função para mostrar as informações da locadora e dos carros
    void mostraInfo(){
        out.println("Nome da Locadora: "+this.nome);
        out.println("CNPJ: "+this.cnpj);
        out.println("Endereço: "+this.endereco);
        out.println("Quantidade de carros para alugar: "+this.carrosParaAlugar);
        out.println();
        out.println("Informaçoes dos carros: ");

        for (Carro carro : carros) {
            carro.mostraInfo();
        }

    }

    //Função para alugar carro
    void alugarCarro(){
        int indisponivel;
        out.println("Digite a posição do carro que sera alugado: ");
        indisponivel = input.nextInt();
        carros[indisponivel].alugado = true;
        //input.close();
    }
    //Função que retorna a porcentagem de carros que tem para alugar
    float contarCarrosParaAlugar(){
        float paraAlugar = 0;
        float  qtd=0;

        for (Carro carro : carros) {
            if (!carro.alugado) {
                paraAlugar++;
            }
            qtd++;
        }
        return (paraAlugar/qtd)*100;

    }

}
