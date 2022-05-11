package br.inatel.cdg;

import br.inatel.cdg.mamifero.Mamifero;
import br.inatel.cdg.mamifero.baleia.Baleia;
import br.inatel.cdg.mamifero.cachorro.Cachorro;
import br.inatel.cdg.mamifero.lontra.Lontra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List mamiferos  = new ArrayList<Mamifero>();

        mamiferos.add(new Cachorro("belinha", 15) );
        mamiferos.add(new Cachorro("Luna", 2) );
        mamiferos.add(new Lontra("Bichin", 25) );
        mamiferos.add(new Lontra("pexin", 7) );
        mamiferos.add(new Baleia("Azul", 56) );
        mamiferos.add(new Baleia("Orca", 125) );


    }
}
