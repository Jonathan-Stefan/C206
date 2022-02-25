import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("Digite 0 para E e 1 para OU");
            x = sc.nextInt();

        }while (!(x == 0 || x == 1));

        if (x == 0)
        {
            System.out.println("0 e 0 = 0");
            System.out.println("0 e 1 = 0");
            System.out.println("1 e 0 = 0");
            System.out.println("1 e 1 = 1");
        }
        else
        {
            System.out.println("0 ou 0 = 0");
            System.out.println("0 ou 1 = 1");
            System.out.println("1 ou 0 = 1");
            System.out.println("1 ou 1 = 1");
        }

        sc.close();


    }
}
