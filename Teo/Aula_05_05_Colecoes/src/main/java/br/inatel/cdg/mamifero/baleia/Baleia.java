package br.inatel.cdg.mamifero.baleia;

import br.inatel.cdg.mamifero.Mamifero;

public class Baleia extends Mamifero {
    private String nome;
    private int idade;

    public Baleia(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public int compareTo(Mamifero o) {
        return 0;
    }
}
