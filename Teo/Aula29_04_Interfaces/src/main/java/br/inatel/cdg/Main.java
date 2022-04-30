package br.inatel.cdg;

import br.inatel.cdg.mamifero.Mamifero;
import br.inatel.cdg.mamifero.boi.Boi;
import br.inatel.cdg.mamifero.cachorro.Cachorro;
import br.inatel.cdg.mamifero.lontra.Lontra;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Lobo", 27);
        Lontra l1 = new Lontra("Bicho do mato", 7);
        Boi b1 = new Boi("Anestor", 17);

        c1.emitirSom();
        c1.mostraInfo();
        System.out.println();
        l1.nadar();
        l1.emitirSom();
        l1.mostraInfo();
        System.out.println();
        b1.emitirSom();
        b1.mostraInfo();

    }
}
