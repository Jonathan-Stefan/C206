package br.inatel.cdg.calculadora.dividir;

public class Dividir {

    public float dividir(float a, float b) throws java.lang.ArithmeticException
    {
        if (b==0)
            throw new ArithmeticException();
        else
        return a/b;
    }


}
