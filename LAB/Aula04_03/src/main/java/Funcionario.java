public class Funcionario {

    int idade;
    String cpf;
    String nome;
    double salario;

    public Funcionario(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }; // Construtor da clase, ja existe no JAVA mas deixa implicito

    public  Funcionario (){};

    void tirarFerias (String mes){
        System.out.println("funcionario" + nome + "vai tirar ferias em: " + mes);

    }

    double calculaSalarioAnual (){
        return 12*salario;
    }
}
