package br.inatel.cdg;

import br.inatel.cdg.mamifero.Mamifero;
import br.inatel.cdg.mamifero.baleia.Baleia;
import br.inatel.cdg.mamifero.cachorro.Cachorro;
import br.inatel.cdg.mamifero.lontra.Lontra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List mamiferos  = new ArrayList<Mamifero>();
        Scanner input = new Scanner(System.in);
        List<Mamifero> listaDeMamiferos = new ArrayList<>();


        mamiferos.add(new Cachorro("belinha", 15) );
        mamiferos.add(new Cachorro("Luna", 2) );
        mamiferos.add(new Lontra("Bichin", 25) );
        mamiferos.add(new Lontra("pexin", 7) );
        mamiferos.add(new Baleia("Azul", 56) );
        mamiferos.add(new Baleia("Orca", 125) );

        for (int i=0; i<6; i++){
            System.out.println("Digite os nome dos cachorros");
            String nome = input.nextLine();
            mamiferos.add(listaDeMamiferos.set(nome));

        }

        mamiferos . forEach ( cachorro -> {
            System.out.println ( mamiferos.getNome );
            Sistema . fora . println ( produto . getPreco ());


    }
}
