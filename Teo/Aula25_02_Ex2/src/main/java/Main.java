import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeroDeZumbis = new Scanner(System.in);


        System.out.println("Entre com a quantidade de zumbis mortos na antepenultima rodada");
        int antepenultima = numeroDeZumbis.nextInt();
        System.out.println("Entre com a quantidade de zumbis mortos na penultima rodada");
        int penultima = numeroDeZumbis.nextInt();
        System.out.println("Entre com a quantidade de zumbis mortos na ultima rodada");
        int ultima = numeroDeZumbis.nextInt();

        int total = antepenultima + penultima + ultima;
        float media = (float) total / 3;

        System.out.printf("total de mortos foram: %d \n", + total);
        System.out.printf("A media de mortes foi: %f \n", + media);

        numeroDeZumbis.close();

    }
}
