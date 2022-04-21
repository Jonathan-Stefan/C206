package br.inatel.cdg.calculadora;

import br.inatel.cdg.calculadora.dividir.Dividir;
import br.inatel.cdg.calculadora.multiplicar.Multiplicar;
import br.inatel.cdg.calculadora.soma.Soma;
import br.inatel.cdg.calculadora.subtrair.Subtrair;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Soma soma = new Soma();
        Subtrair subtrair = new Subtrair();
        Multiplicar multiplicar = new Multiplicar();
        Dividir dividir = new Dividir();
        Scanner input = new Scanner(System.in);
        String x; //Variavel auxiliar para escolher a opca e sair do menu

        float a, b; // Numero que serão calculados

        do {
            System.out.println("Digite a operação desejada: ");
            System.out.println("1 = para SOMAR; ");
            System.out.println("2 - para SUBTRAIR; ");
            System.out.println("3 - para MULTIPLICAR; ");
            System.out.println("4 - para DIVIDIR; ");
            System.out.println("sair - para encerrar. ");

            x = input.nextLine();

            switch (x){
                case "1":

                    System.out.println("Digite os numeros a serem somados: ");
                    a = input.nextFloat();
                    b = input.nextFloat();
                    input.nextLine();
                    System.out.println("O resultado da soma eh: "+ soma.somar(a, b));
                break;

                case "2":
                    System.out.println("Digite os numeros a serem subtraidos: ");
                    a = input.nextFloat();
                    b = input.nextFloat();
                    input.nextLine();
                    System.out.println("O resultado da Subtração eh: "+ subtrair.subtrair(a, b));
                break;

                case "3":
                    System.out.println("Digite os numeros a serem multiplicados: ");
                    a = input.nextFloat();
                    b = input.nextFloat();
                    input.nextLine();
                    System.out.println("O resultado da multiplicação eh: "+ multiplicar.multiplicar(a, b));
                break;

                case "4":
                    try{

                    System.out.println("Digite os numeros a serem divididos: ");
                    a = input.nextFloat();
                    b = input.nextFloat();
                    input.nextLine();
                    System.out.println("O resultado da divisão eh: "+ dividir.dividir(a, b));
                    }catch (ArithmeticException exception){
                        System.out.println("Não existe divisão por zero! ");
                    }

                    break;

                default:
                    if (x.equals("sair"))
                        System.out.println("Obrigado por usar nossos serviços. ");
                    else System.out.println("Entrada invalida! Tente novamente. ");
                break;
            }
        }while (!(x.equals("sair")));
        input.close();
    }
}
