package br.inatel.cdg.mamifero;

public abstract class Mamifero implements Comparable<Mamifero>{

    protected String nome;
    protected  int idade;

    public Mamifero (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
