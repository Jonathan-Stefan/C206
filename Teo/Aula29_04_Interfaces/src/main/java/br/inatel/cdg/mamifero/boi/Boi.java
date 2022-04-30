package br.inatel.cdg.mamifero.boi;

import br.inatel.cdg.mamifero.Mamifero;

public class Boi extends Mamifero {


    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("O boi ta mujindo. ");
    }
}
