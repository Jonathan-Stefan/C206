package br.inatel.cdg.mamifero.lontra;

import br.inatel.cdg.interfaces.Aquatico;
import br.inatel.cdg.mamifero.Mamifero;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Lontra fazendo barulho");
    }

    @Override
    public void nadar() {
        System.out.println("Saiu nadando e roubando peixe.");
    }
}
