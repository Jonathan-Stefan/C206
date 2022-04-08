public class Carro {

    String nome, cor;
    boolean alugado;
    Motor motor;

    //Criando o obejeto motor dentro do Construtor de carro
    public Carro() {
        motor = new Motor();
    }

    void mostraInfo(){
        System.out.println("Nome do carro: "+nome);
        System.out.println("cor: "+ cor);
        motor.mostraInfo();
        System.out.print("Esta alugado? ");
        if(alugado){
            System.out.println("Sim!");
        }
        else System.out.println("Não!");
        System.out.println();
    }
}
