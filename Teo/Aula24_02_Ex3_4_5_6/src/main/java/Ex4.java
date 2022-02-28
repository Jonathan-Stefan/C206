import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner qtdAlunos = new Scanner(System.in);

        System.out.println("Entre com a quantidade de alunos");
        int qtd = qtdAlunos.nextInt();

        switch (qtd)
        {
            case 10:
                System.out.println("Utilizar a sala I - 15");
                break;
            case 20:
                System.out.println("Utilizar a sala I - 15");
                break;
            case 30:
                System.out.println("Utilizar a sala I - 22");
            break;
            default:
                System.out.println("numero de Alunos invalido, so pode 10, 20 ou 30 " +
                        "verifique a quantidade ou procure a coordenação");
        }
        qtdAlunos.close();


    }
}
