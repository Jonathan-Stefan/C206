package br.inatel.cdg;

import br.inatel.cdg.mamifero.Mamifero;
import br.inatel.cdg.mamifero.baleia.Baleia;
import br.inatel.cdg.mamifero.cachorro.Cachorro;
import br.inatel.cdg.mamifero.lontra.Lontra;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> nome  = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        List<Mamifero> listaDeMamiferos = new ArrayList<>();

        String aux;


        for (int i=0; i<6; i++){
            System.out.println("Digite o nome do Mamifero: ");
            aux = input.nextLine();
            nome.add(aux);
        }

        listaDeMamiferos.add(new Cachorro(nome.get(0), new Random().nextDouble()*100) );
        listaDeMamiferos.add(new Cachorro(nome.get(1), new Random().nextDouble()*100) );
        listaDeMamiferos.add(new Lontra(nome.get(2), new Random().nextDouble()*100) );
        listaDeMamiferos.add(new Lontra(nome.get(3), new Random().nextDouble()*100) );
        listaDeMamiferos.add(new Baleia(nome.get(4), new Random().nextDouble()*100) );
        listaDeMamiferos.add(new Baleia(nome.get(5), new Random().nextDouble()*100) );


        System.out.println("Saida antes da ordenação");

        for (int i=0; i<6; i++){
            System.out.println("nome: "+ listaDeMamiferos.get(i).getNome() +" vida: "+listaDeMamiferos.get(i).getvida());
        }
        System.out.println();

        Collections.sort(listaDeMamiferos,Collections.reverseOrder());

        //Collections.reverse(listaDeMamiferos);

        for (int i=0; i<6; i++){
            System.out.println("nome: "+ listaDeMamiferos.get(i).getNome() +" vida: "+listaDeMamiferos.get(i).getvida());
        }


    }
}
