package br.inatel.cdg;

import br.inatel.cdg.Calculadora.Calculadora;

public class Main{

    public static void main(String[] args) {

        double raio = 6;
        System.out.println("O valor da circunferencia de raio "+Calculadora.circunferencia(raio));
        System.out.println("Valor do volume do raio: "+Calculadora.volume(raio));
        System.out.println(Calculadora.getQtdVezes());
    }
}
