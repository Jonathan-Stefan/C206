package br.inatel.cdg;

import br.inatel.cdg.matematica.Matematica;

public class Main {

    public static void main(String[] args) {

        Matematica matematica = new Matematica();

        //Usando o fully qualified name
        br.inatel.cdg.outramatematica.Matematica matematica2 = new br.inatel.cdg.outramatematica.Matematica();
    }
}
