//Importa a Biblioteca Scanner do JAVA
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Declara a variavel notaAluno do tipo scanner pra fazer entrada de dado
        Scanner notaAluno = new Scanner( System.in);

        System.out.println("Entre com a nota NPA do Aluno: ");
        float npa = notaAluno.nextFloat();

        if (npa >= 60)
        {
            System.out.println("Aluno Aprovado");
        }
        else if(npa >=30)
        {
            System.out.println("Precisa fazer NP3");
            System.out.println("Entre com a nota de NP3");
            float np3 = notaAluno.nextFloat();
            if ((npa + np3)/2 >= 50)
            {
                System.out.println("Aluno Aprovado");
            }
            else System.out.println("Aluno Reprovado");
        }
        else System.out.println("Aluno Reprovado");

        notaAluno.close();
    }

}
