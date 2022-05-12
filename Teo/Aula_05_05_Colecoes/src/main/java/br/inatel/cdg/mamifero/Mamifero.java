package br.inatel.cdg.mamifero;

public abstract class Mamifero implements Comparable<Mamifero>{

    protected String nome;
    protected  double idade;

    public Mamifero (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getIdade() {
        return idade;
    }
}
