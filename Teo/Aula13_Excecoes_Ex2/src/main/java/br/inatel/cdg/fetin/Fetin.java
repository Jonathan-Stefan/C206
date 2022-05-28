package br.inatel.cdg.fetin;

import br.inatel.cdg.excecoes.checked.NotaInsuficiente;
import br.inatel.cdg.excecoes.unchecked.NomeDuplicado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fetin {

    private int cont = 0;

    public int getCont() {
        return cont;
    }

    List<String> listaDeNome = new ArrayList<>();


    Map<String, Double> projetosNotas = new HashMap<>();

    public void inserirProjeto(String nome, double nota) throws NotaInsuficiente, NomeDuplicado{

        listaDeNome.add(nome);

        for (int i = 0; i <listaDeNome.size(); i++){
            if (listaDeNome.get(i) == nome) {
                cont++;
            }
        }
        //cont = 0;


        if(nota>=60 && cont <2){
            projetosNotas.put(nome, nota);
        }
        else
            if (cont>=2)
                throw new NomeDuplicado("Projeto com nome repetido.");
            else
                if (nota<60){
                    throw new NotaInsuficiente("Sua nota não foi o suficiente para ser aprovado.");
                }


    }

    public void mostraInfo(){
        projetosNotas.forEach((nome, nota)-> {
            System.out.println("Projeto: "+nome);
            System.out.println("Nota: "+ nota);
        });
    }

}
