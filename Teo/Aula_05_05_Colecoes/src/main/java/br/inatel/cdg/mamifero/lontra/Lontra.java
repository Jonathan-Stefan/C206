package br.inatel.cdg.mamifero.lontra;

import br.inatel.cdg.mamifero.Mamifero;

public class Lontra extends Mamifero {


    public Lontra(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public int compareTo(Mamifero o) {
        return 0;
    }
}
