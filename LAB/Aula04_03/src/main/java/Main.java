public class Main {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Phill", 34, "123456789"); //Adicona atributos direto a classe
        Funcionario f2 = new Funcionario();
        //f1.nome = "Phill";
        //f1.cpf = "123456789";
        f1.salario = 2000;
        //f1.idade = 34;

        f2.nome = "Jonathan";

        f1.tirarFerias("Janeiro");

    }
}
