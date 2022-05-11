package br.inatel.cdg.mamifero.cachorro;

import br.inatel.cdg.mamifero.Mamifero;

public class Cachorro extends Mamifero {


    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public int compareTo(Mamifero o) {
        return 0;
    }
}
