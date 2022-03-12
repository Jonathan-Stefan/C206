public class Carro {

    String nome, cor;
    boolean alugado;
    Motor motor;

    //Construtor do motor
    public Carro() {
        motor = new Motor();
    }

    void mostraInfo(){
        System.out.println("Nome do carro: "+nome);
        System.out.println("cor: "+ cor);
        System.out.println("Esta alugado? ");
        if(alugado == true){
            System.out.println("Este carro esta alugado!");
        }
        else System.out.println("Este carro não esta alugado!");
    }
}
