package br.inatel.cdg.fetin;

import br.inatel.cdg.excecoes.checked.NotaInsuficiente;
import br.inatel.cdg.excecoes.unchecked.NomeDuplicado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fetin {


    List<String> listaDeNome = new ArrayList<>();


    Map<String, Double> projetosNotas = new HashMap<>();

    public void inserirProjeto(String nome, double nota) throws NotaInsuficiente, NomeDuplicado{

        if(nota>=60){
            projetosNotas.put(nome, nota);
        }
        else throw new NotaInsuficiente("Sua nota não foi o suficiente para ser aprovado.");

    }

    public void mostraInfo(){
        projetosNotas.forEach((nome, nota)-> {
            System.out.println("Projeto: "+ nome);
            System.out.println("Nota: "+ nota);
        });
    }
    public void verificaNomeDuplicado(String nome){

        if (! listaDeNome.contains(nome)){
            listaDeNome.add(nome);
        }else
            throw new NomeDuplicado("Projeto com nome Duplicado!");

    }


}
