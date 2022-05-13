package br.inatel.cdg.mamifero;

public abstract class Mamifero implements Comparable<Mamifero>{

    private String nome;
    private double vida;

    public Mamifero (String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public double getvida() {
        return vida;
    }

    @Override
    public int compareTo(Mamifero o) {
        if (this.vida < o.getvida()){
            return -1;
        }
        if (this.vida > o.getvida()){
            return 1;
        }

        return 0;
    }
}
