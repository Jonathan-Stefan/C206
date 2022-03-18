package br.inatel.cdg.Calculadora;

public class Calculadora {

    private static  double PI = 3.14;
    private static int qtdVezes = 0;

    public static double circunferencia (double raio){
        qtdVezes++;
        return PI*(raio*raio);

    }

    public static double volume (double raio){
        qtdVezes++;
        return (4.0/3.0)*PI*(raio*raio*raio);
    }

    public static int getQtdVezes(){
        return qtdVezes;
    }
}
