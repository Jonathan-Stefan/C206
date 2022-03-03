import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner numeroEscolhido = new Scanner(System.in);

        //Declara a variavel rand do tipo Random para gerar numeros aleatorios
        Random rand = new Random();

        //Gera um numero aleatório entre 1 e 10
        int x = rand.nextInt(10) + 1;
        System.out.println("Adivinhe o numero que foi gerado");

        int numero;

        do {
            System.out.println("Adivinhe o numero que foi gerado");
            numero = numeroEscolhido.nextInt();

            if (numero > x)
                System.out.println("O numero digitado eh maior que o numero gerado");
            if (numero < x)
                System.out.println("O numero digitado eh menor que o numero gerado");
        } while (!(x == numero));
        System.out.println("Parabens!! Voce acertou, o numero gerado foi: " + x);

        numeroEscolhido.close();
    }
}
